package servlets;

import dao.UserDAO;
import beans.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 요청과 응답 인코딩 설정
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // 사용자가 입력한 이메일과 비밀번호 가져오기
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // 디버깅: 입력값 확인
        System.out.println("Debug: Received email: " + email);
        System.out.println("Debug: Received password: " + password);

        // UserDAO를 통해 로그인 확인
        UserDAO userDAO = new UserDAO();
        User user = userDAO.login(email, password);

        // 디버깅: 로그인 결과 확인
        if (user != null) {
            System.out.println("Debug: Login successful for user: " + user.getUsername());
            
            // 로그인 성공 시 세션에 사용자 정보 저장
            HttpSession session = request.getSession();
            session.setAttribute("userId", user.getEmail());
            session.setAttribute("username", user.getUsername());

            // 디버깅: 세션 확인
            System.out.println("Debug: Session userId: " + session.getAttribute("userId"));
            System.out.println("Debug: Session username: " + session.getAttribute("username"));

            // 메인 페이지로 이동
            response.sendRedirect(request.getContextPath() + "/views/main_bankview.jsp");
        } else {
            // 로그인 실패 시 오류 메시지와 함께 로그인 페이지로 이동
            System.out.println("Debug: Login failed. Invalid email or password.");

            request.setAttribute("error", "Invalid email or password. Please try again.");
            request.getRequestDispatcher("/views/sign-in.jsp").forward(request, response);
        }
    }
}
