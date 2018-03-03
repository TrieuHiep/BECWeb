package controller;

import dao.persondaopkg.AccountDAO;
import daoimpl.AccountDAOImpl;
import daoimpl.CustomerDAOImpl;
import model.customerpkg.Customer;
import model.userpkg.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Account account = new Account(username, password);
            AccountDAO accountDAO = new AccountDAOImpl();

            if (accountDAO.checkAccount(account)) {
                Customer customer =
                        new CustomerDAOImpl().getCustomer(account);
                session.setAttribute("loggedCustomer", customer);
                session.setAttribute("loggedAccount", account);
                response.sendRedirect("homepage.jsp");
            } else {
                out.println("<script type=\"text/javascript\">\n" +
                        "alert('The username or password is incorrect');\n" +
                        "location='loginjsp';\n" +
                        "</script>");
            }
        } catch (SQLException ex) {

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println(request.getParameter("bookName"));
    }
}
