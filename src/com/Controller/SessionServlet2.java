package com.Controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet2")
public class SessionServlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		out.print(new Date(session.getCreationTime()));
		
		String s=(String)	session.getAttribute("s1");
		out.print(s+"<br>");
		out.print(session.getId());
		//Until you invalidate the session the same session state is forwarded
		session.invalidate();
		session=request.getSession();
		out=response.getWriter();
		out.print(new Date(session.getCreationTime()));
		
		s=(String)	session.getAttribute("s1");
		out.print(s+"<br>");
		out.print(new Date(session.getLastAccessedTime())+"<br>");
		out.print(session.getId());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
