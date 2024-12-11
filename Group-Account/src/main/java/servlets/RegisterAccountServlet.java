package servlets;

import dao.AccountDAO;
import beans.Account;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterAccountServlet")
public class RegisterAccountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 요청과 응답 인코딩 설정
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // 사용자 입력 받기
        String accountName = request.getParameter("account-name");
        String description = request.getParameter("description");
        String bankName = request.getParameter("bankname");
        String accountNumber = request.getParameter("account-number");

        // 로그인한 사용자 ID 가져오기
        Integer userId = (Integer) request.getSession().getAttribute("userId"); // 세션에서 userId 가져오기
        if (userId == null) {
            response.getWriter().println("로그인이 필요합니다!");
            return;
        }

        // Account 객체 생성 및 값 설정
        Account account = new Account();
        account.setUserId(userId);
        account.setAccountName(accountName);
        account.setDescription(description);
        account.setBankName(bankName);
        account.setAccountNumber(accountNumber);

        // DAO를 이용한 통장 등록 처리
        AccountDAO accountDAO = new AccountDAO();
        boolean isRegistered = accountDAO.registerAccount(account);

        if (isRegistered) {
            request.setAttribute("message", "통장이 성공적으로 등록되었습니다!");
            request.getRequestDispatcher("/views/success.jsp").forward(request, response);
        } else {
            request.setAttribute("message", "통장 등록에 실패했습니다. 다시 시도해주세요.");
            request.getRequestDispatcher("/views/error.jsp").forward(request, response);
        }
    }
}
