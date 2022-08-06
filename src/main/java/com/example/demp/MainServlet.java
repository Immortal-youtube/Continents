package com.example.demp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

@WebServlet(name = "MainServlet", urlPatterns = {"/",""})
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        System.out.println("It works?");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = request.getParameter("link");
        String query = request.getParameter("query");

        String finalUrl = url + query;
        if(url == null || query == null){
            request.setAttribute("error", "Please enter a URL and a query");
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }else{
            WebClient webClient = new WebClient();
        }
    }
}
