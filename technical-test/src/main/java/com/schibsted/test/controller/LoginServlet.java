package com.schibsted.test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.schibsted.test.model.User;
import com.schibsted.test.service.UserService;
import com.schibsted.test.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserService userService;

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		User user = getUserService().getUser(request.getParameter("username"), request.getParameter("password"));
		if (user != null) {
			request.getSession().setAttribute("user", user);
			Cookie userCookie = new Cookie("userCookie", user.getUsername());
			//time in seconds of session
			userCookie.setMaxAge(60*5);
            response.addCookie(userCookie);
			response.sendRedirect("navigate.jsp");
		} else {
			request.setAttribute("error", "Unknown user or password, please try again");
            request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

	public UserService getUserService() {
		if(userService == null) {
			setUserService(new UserServiceImpl());
		}
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
