package com.example.calc;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import models.Calc;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Калькулятор";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        HttpSession session =request.getSession();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>  helloooo" + "</h1>");
        out.println("</body></html>");

        Calc calc =(Calc) session.getAttribute("calc");
        String name=request.getParameter("name");
        Integer a=Integer.parseInt(request.getParameter("a"));
        Integer b=Integer.parseInt(request.getParameter("b"));
        if(calc==null){
            calc=new Calc();
            calc.setOperation(name);
            calc.setOperand1(a);
            calc.setOperand1(b);
            calc.calculate(name,a,b);

        }
        session.setAttribute("calc",calc);

    }

    public void destroy() {
    }
}