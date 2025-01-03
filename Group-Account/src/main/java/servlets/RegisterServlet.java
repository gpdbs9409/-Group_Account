package servlets;

import beans.User;
import dao.UserDAO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 요청과 응답 인코딩 설정
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // 사용자 입력 받기
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // 빈 생성 및 값 설정
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        // DAO를 이용한 회원가입 처리
        UserDAO userDAO = new UserDAO();
        boolean isRegistered = userDAO.register(user);

        if (isRegistered) {
            // 성공 시 success.jsp로 포워딩
            request.setAttribute("message", "회원가입이 완료되었습니다!");
            request.getRequestDispatcher("/views/main_bankview.jsp").forward(request, response);
        } else {
            // 실패 시 error.jsp로 포워딩
            request.setAttribute("message", "회원가입에 실패했습니다. 다시 시도해주세요.");
            request.getRequestDispatcher("/views/deposit.jsp").forward(request, response);
        }
    }
}

