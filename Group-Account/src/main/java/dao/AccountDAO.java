package dao;

import beans.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AccountDAO {
    private Connection conn;

    public AccountDAO() {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/user_db?characterEncoding=UTF-8&serverTimezone=UTC";
            String dbUser = "Yoon";
            String dbPassword = "1420";
            System.out.println("Connecting to database: " + dbURL);
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            System.out.println("Database connection successful!");
        } catch (Exception e) {
            e.printStackTrace(); // 연결 실패 시 오류 출력
        }
    }

    public boolean registerAccount(Account account) {
        String SQL = "INSERT INTO account (account_name, description, bank_name, account_number) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);

            pstmt.setString(1, account.getAccountName()); // account_name
            pstmt.setString(2, account.getDescription()); // description
            pstmt.setString(3, account.getBankName());    // bank_name
            pstmt.setString(4, account.getAccountNumber());// account_number

            System.out.println("Executing SQL: " + SQL);
            System.out.println("Parameters: " + account.getAccountName() + ", " + account.getDescription() + ", " 
                + account.getBankName() + ", " + account.getAccountNumber());

            pstmt.executeUpdate();
            return true; // 통장 등록 성공
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // 통장 등록 실패
    }
}
