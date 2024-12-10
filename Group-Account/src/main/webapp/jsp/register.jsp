<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta charset="UTF-8">

<%@ page import="beans.User" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%
    // 사용자 입력 받기
    String username = request.getParameter("username");
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    // 빈 생성 및 값 설정
    User user = new User();
    user.setUsername(username);
    user.setEmail(email);
    user.setPassword(password);

    // 데이터베이스 연결
    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        // JDBC 드라이버 로드
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 데이터베이스 연결
        String dbURL = "jdbc:mysql://localhost:3306/user_db?useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC&useUnicode=true";
        String dbUser = "Yoon"; // MySQL 사용자 이름
        String dbPassword = "1420"; // MySQL 비밀번호
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

        // SQL INSERT 쿼리 실행
        String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getEmail());
        pstmt.setString(3, user.getPassword());
        int rowsInserted = pstmt.executeUpdate();

        if (rowsInserted > 0) {
            out.println("<h3>회원가입이 완료되었습니다!</h3>");
        } else {
            out.println("<h3>회원가입에 실패했습니다. 다시 시도해주세요.</h3>");
        }
    } catch (Exception e) {
        e.printStackTrace();
        out.println("<h3>오류가 발생했습니다: " + e.getMessage() + "</h3>");
    } finally {
        // 리소스 해제
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
%>
