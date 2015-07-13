<%@ page import="com.schibsted.test.model.User, com.schibsted.test.model.Rol, java.util.List"%>
<%@ page import="com.schibsted.test.helper.Helper, java.util.Map"%>
<%

	Cookie loginCookie = null;
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
	    for (Cookie cookie : cookies) {
	        if (cookie.getName().equals("userCookie")) {
	            loginCookie = cookie;
	            break;
	        }
	    }
	}

	if (loginCookie == null) {
		request.setAttribute("error", "User not loged");
        request.getRequestDispatcher("login.jsp").forward(request, response);
	} else {
		User user = (User)session.getAttribute("user");	
		List<Rol> roles = user.getRoles().getRoles();
		if (request.getAttribute("idPage") != null) {
			boolean canAccess = false;
			String idPage = (String)request.getAttribute("idPage");
			Map<String, String> rolesHelper = Helper.getInstance().getRolesPages();
			for (Rol rol : roles) {
				String idPageToVisit = rolesHelper.get(rol.getIdRol());
				if (idPageToVisit.equals(idPage)){
					canAccess = true;
					break;
				}
			}
			if(!canAccess) {
				request.setAttribute("error", "Access denied to this page");
				request.setAttribute("idPage", null);
		        request.getRequestDispatcher("navigate.jsp").forward(request, response);
			}
		}
	}
%>