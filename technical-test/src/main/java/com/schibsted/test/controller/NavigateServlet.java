package com.schibsted.test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NavigateServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String idPage = (String)request.getParameter("idPage");
		String pageToNavigate = "page_"+idPage+".jsp";
		request.setAttribute("idPage", idPage);
		request.getRequestDispatcher(pageToNavigate).forward(request, response);
		
	}
	
}
