package com.assignment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false); // avoid creating new session
        response.setContentType("text/html");

        if (session != null && session.getAttribute("username") != null) {
            String name = (String) session.getAttribute("username");
            String password = (String) session.getAttribute("password");

            response.getWriter().println("<h2>Welcome: " + name + "</h2>");
            response.getWriter().println("<p>Password: " + password + "</p>");
        } else {
            response.getWriter().println("<h3>No session found. Please <a href='index.html'>login</a> again.</h3>");
        }
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
