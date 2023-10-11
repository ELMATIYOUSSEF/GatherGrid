package com.gathergrid.gathergrid;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

public class Servletv2 extends HelloServlet{

    public Servletv2() {
        super();
    }
    private String message;

    public void init() {
        message = "My name is youssef !";
        System.out.println("hi i'm here");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        // Associer une vue à une Servlet
        request.setAttribute("message",message);
      this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request,response);
    }




    public void destroy() {
    }
}