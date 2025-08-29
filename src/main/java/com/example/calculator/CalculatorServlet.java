package com.example.calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    double num1 = Double.parseDouble(request.getParameter("num1"));
    double num2 = Double.parseDouble(request.getParameter("num2"));
    String op = request.getParameter("operation");

    double result = 0;

    switch (op) {
      case "add": result = num1 + num2; break;
      case "subtract": result = num1 - num2; break;
      case "multiply": result = num1 * num2; break;
      case "divide": result = num2 != 0 ? num1 / num2 : 0; break;
    }

    out.println("<h1>Result: " + result + "</h1>");
  }
}

