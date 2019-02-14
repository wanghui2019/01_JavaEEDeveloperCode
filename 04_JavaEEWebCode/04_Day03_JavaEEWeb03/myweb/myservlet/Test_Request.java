package com.myweb.myservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test_Request
 */
public class Test_Request extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置响应的数据类型是html,并且告知浏览器,使用UTF-8来编码
		response.setContentType("text/html;charset=utf-8");
		//指定输出到客户端时,这些文字的编码方式
		response.setCharacterEncoding("utf-8");
		//以字符的形式向客户端写数据
		response.getWriter().write("哈哈哈");
		//以字节的形式向客户端写数据
		//response.getOutputStream().write("helloOutputStream".getBytes());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
