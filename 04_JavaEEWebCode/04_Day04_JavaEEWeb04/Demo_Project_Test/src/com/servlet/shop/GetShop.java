package com.servlet.shop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.select.cookie.Select_Cookie;

/**
 * Servlet implementation class GetShop
 */
public class GetShop extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//根据名称获取值
		String id = request.getParameter("id");       
		//得到请求来的Cookie
		Cookie[] cookies = request.getCookies();
		//获取是哪一个Cookie
		Cookie selectCookie = Select_Cookie.selectCookie(cookies, "history");      
		//第一次请求
		if (selectCookie==null) {
			//添加cookie
			Cookie cookie=new Cookie("history", id); 
			response.addCookie(cookie);             
			//cookie保存一天
			cookie.setMaxAge(60*60*24);
			response.sendRedirect("product_info.htm");
		}else {
			//根据cookie的键获取值
			String oldid = selectCookie.getValue();  
			
			//记录新的cookie
			selectCookie.setValue(oldid+"#"+id);    
			response.addCookie(selectCookie);
			
			//跳转,让浏览记录显示出来
			response.sendRedirect("product_info.htm");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
