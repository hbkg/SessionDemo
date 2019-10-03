package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie=new Cookie("Cookie","Demo");
		PrintWriter out=response.getWriter();
		cookie.setMaxAge(10);
		cookie.setDomain(getServletName());
		out.println(cookie.getDomain()+"<br>");
		out.println(cookie.getMaxAge()+"<br>");
		out.println(cookie.getName()+"<br>");
		cookie.setPath("D:\\Java2");
		out.println(cookie.getPath()+"<br>");
		out.println(cookie.getValue()+"<br>");
		out.println(cookie.toString()+"<br>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
