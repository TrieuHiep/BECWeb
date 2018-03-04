package controller;

import factory.ElectronicsFactory;
import factory.ProductFactory;
import model.itemspkg.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SearchProductServlet")
public class SearchProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try {
            int productType = Integer.parseInt(request.getParameter("productType"));
            String type = request.getParameter("electronicType");
            ProductFactory productFactory = ProductFactory.getProductFactory(productType);
            Product[] products = productFactory.getProduct(type);

            session.setAttribute("searchProductResult", products);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("search.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
