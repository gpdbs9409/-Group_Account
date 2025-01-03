package dao;

import beans.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
    private Connection conn;

    public UserDAO() {
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

    public User login(String email, String password) {
        String SQL = "SELECT * FROM users WHERE email = ? AND password = ?";
        System.out.println("Executing login query with email: " + email + " and password: " + password);
        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, email);
            pstmt.setString(2, password);

            System.out.println("PreparedStatement executed: " + pstmt.toString());

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                // 사용자 정보를 반환
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));

                System.out.println("Login successful for user: " + user.getUsername() + " (" + user.getEmail() + ")");
                return user;
            } else {
                System.out.println("No user found with the provided credentials.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred during login:");
            e.printStackTrace();
        }
        return null; // 사용자 정보가 없으면 null 반환
    }



    public boolean register(User user) {
        String SQL = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getEmail());
            System.out.println("Executing SQL: " + SQL);
            System.out.println("Parameters: " + user.getUsername() + ", " + user.getPassword() + ", " + user.getEmail());
            
            
            pstmt.executeUpdate();
            return true; // 회원가입 성공
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // 회원가입 실패
    }
    
    
}


