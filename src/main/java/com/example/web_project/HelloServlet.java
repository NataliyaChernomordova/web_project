package com.example.web_project;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String name = request.getParameter("name");
//        String lastName = request.getParameter("lastName");
//        response.setContentType("text/html");


//        Integer count = (Integer) session.getAttribute("count");
//        if (count == null){
//            count = 1;
//            session.setAttribute("count", count);
//        } else {
//            session.setAttribute("count", count + 1);
//        }
        // Hello
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Hello, " + "</h1>");
        out.println("</br>");
        out.println("</body></html>");
//        Cart cart = (Cart) session.getAttribute("cart");

//        String name = request.getParameter("name");
//        int a = Integer.parseInt("110");
//        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        if (cart == null){
//            cart = new Cart();
//
//            cart.setProduct(name);
//            cart.setQuantity(quantity);
//        }
//
//        session.setAttribute("cart", cart);

        Calculator calculator = (Calculator) session.getAttribute("calculator");

        Integer a = Integer.parseInt(request.getParameter("a"));
        Integer b = Integer.parseInt(request.getParameter("b"));
        String operation = request.getParameter("operation");
        Integer result = 0;



//        RequestDispatcher dispatcher = request.getRequestDispatcher("/first-servlet.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException e) {
//            throw new RuntimeException(e);
//        }

//        response.sendRedirect("https://ya.ru/");
    }

    public void destroy() {
    }
}