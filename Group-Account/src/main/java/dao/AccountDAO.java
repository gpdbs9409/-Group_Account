package dao;

import beans.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
        String SQL = "INSERT INTO account (user_id, account_name, description, bank_name, account_number) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);

            pstmt.setInt(1, account.getUserId());         // user_id
            pstmt.setString(2, account.getAccountName());// account_name
            pstmt.setString(3, account.getDescription());// description
            pstmt.setString(4, account.getBankName());   // bank_name
            pstmt.setString(5, account.getAccountNumber());// account_number

            System.out.println("Executing SQL: " + SQL);
            pstmt.executeUpdate();
            return true; // 통장 등록 성공
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // 통장 등록 실패
    }
    
    public List<Account> getAccountsByUserId(int userId) {
        List<Account> accounts = new ArrayList<>();
        String SQL = "SELECT * FROM account WHERE user_id = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Account account = new Account();
                
                account.setUserId(rs.getInt("user_id"));
                account.setAccountName(rs.getString("account_name"));
                account.setDescription(rs.getString("description"));
                account.setBankName(rs.getString("bank_name"));
                account.setAccountNumber(rs.getString("account_number"));
                accounts.add(account);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accounts;
    }


}
