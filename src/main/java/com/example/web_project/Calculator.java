package com.example.web_project;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
    @WebServlet(name = "calculator", value = "/calculator")
    public class Calculator extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            Integer a = Integer.parseInt(request.getParameter("a"));
            Integer b = Integer.parseInt(request.getParameter("b"));
            String operation = request.getParameter("operation");
            Integer result = 0;
            switch (operation) {
                case ("addition"):
                    result = a + b;
                    break;
                case ("subtraction"):
                    result = a - b;
                    break;
                case ("multiplication"):
                    result = a * b;
                    break;
                case ("division"):
                    result = a / b;
                    break;
            }
            // Hello
//        HttpSession session = request.getSession();
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + result + "</h1>");
            out.println("</body></html>");
//        Calculator calculator = (Calculator) session.getAttribute("calculator");
        }
    }
