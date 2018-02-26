package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@WebServlet(name = "controller.TestServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Properties properties = new Properties();
//        properties.load(
//                this.getClass().getClassLoader()
//                                .getResourceAsStream("MySQL_DBInfo.prop"));
//        String host = properties.getProperty("hostName");
//        System.out.println(host);
    }
}
