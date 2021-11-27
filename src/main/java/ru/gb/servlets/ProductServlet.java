package ru.gb.servlets;

import ru.gb.products.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        resp.setHeader("Content-Type", "text/html; charset=utf-8");



        Product[] products = {
                new Product(1, "Товар 1", 100),
                new Product(2, "Товар 2", 200),
                new Product(3, "Товар 3", 300),
                new Product(4, "Товар 4", 400),
                new Product(5, "Товар 5", 500),
                new Product(6, "Товар 6", 100),
                new Product(7, "Товар 7", 700),
                new Product(8, "Товар 8", 100),
                new Product(9, "Товар 9", 1800),
                new Product(10, "Товар 10", 1900),
        };
        for (Product product : products) {
            resp.getWriter().println(product);



        }

    }


}
