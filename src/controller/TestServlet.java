package controller;

import daoimpl.LaptopDAOImpl;
import factory.ElectronicsFactory;
import model.itemspkg.Product;
import model.itemspkg.electronicspkg.Laptop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

@WebServlet(name = "controller.TestServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//
//            ElectronicsFactory factory = new ElectronicsFactory();
////            Product[] products = factory.getElectronics("laptop");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
