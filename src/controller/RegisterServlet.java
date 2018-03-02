package controller;

import facade.CustomerFacade;
import model.customerpkg.Customer;
import model.userpkg.Account;
import model.userpkg.Address;
import model.userpkg.FullName;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String road = request.getParameter("road");
        String district = request.getParameter("district");
        String city = request.getParameter("city");
        FullName fullName = parseFullName(request.getParameter("fullname"));
        int age = Integer.parseInt(request.getParameter("age"));
        String email = request.getParameter("email");

        Account account = new Account(username, password);
        Address address = new Address(road, district, city);
        Customer customer = new Customer(fullName, account, address, age, email);
        CustomerFacade customerFacade = new CustomerFacade();
        boolean OK = customerFacade.saveCustomerData(customer);

        if(OK){
            out.println("<script type=\"text/javascript\">\n" +
                    "alert('OK');\n" +
                    "location='registerjsp';\n" +
                    "</script>");
        }
        else{
            out.println("<script type=\"text/javascript\">\n" +
                    "alert('Failed');\n" +
                    "location='registerjsp';\n" +
                    "</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private FullName parseFullName(String fullName) {
        if (fullName != null) {
            StringTokenizer stk = new StringTokenizer(fullName, " ");
            FullName fullNameObject = new FullName();
            List<String> nameList = new ArrayList<>();
            while (stk.hasMoreTokens()) {
                nameList.add(stk.nextToken());
            }
            fullNameObject.setFirstName(nameList.get(0));
            fullNameObject.setLastName(nameList.get(nameList.size() - 1));
            String midName = "";
            for (int i = 1; i < nameList.size() - 1; i++) {
                midName += nameList.get(i);
            }
            fullNameObject.setMidName(midName);
            return fullNameObject;
        }
        return null;
    }
}
