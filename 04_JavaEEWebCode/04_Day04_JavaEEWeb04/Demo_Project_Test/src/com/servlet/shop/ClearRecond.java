package com.servlet.shop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.select.cookie.Select_Cookie;

/**
 * Servlet implementation class ClearRecond
 */
public class ClearRecond extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		Cookie cookie = Select_Cookie.selectCookie(cookies, "history");
		cookie.setMaxAge(0);
		cookie.setPath("/Demo_Project_Test");
		response.addCookie(cookie);
		
		response.sendRedirect("product_list.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
