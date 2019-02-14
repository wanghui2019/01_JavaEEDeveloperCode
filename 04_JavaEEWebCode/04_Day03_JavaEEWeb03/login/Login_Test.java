package com.login;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login_Test
 */
public class Login_Test extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取login.html里的username和password信息.request用于请求
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		//response用于服务器向客户端响应数据
		PrintWriter writer = response.getWriter();
		if ("admin".equals(name)&&"123456".equals(password)) {
			/*
			 * getAttribute("a")用于得到一个初始化为null的a对象,在这里a相当于被定义为了一个共享的对象
			 * setAttribute("a",b)用于将b的值交给a
			 * 执行分析:
			 * 第一次登陆
			 * 1.先得到一个对象count,定义为obj
			 * 2.totalcount定义为0
			 * 3.判断obj是否为null,即是判断count是否为null,最初为null,不执行if内的语句
			 * 4.因为count最初为null,执行getServletContext().setAttribute("count", totalcount+1);
			 * 5.totalcount+1变成1,交给count
			 * 
			 * 第二次登陆
			 * 1.count对象是共享的,此时count变为1不为null
			 * 2.执行if内的语句totalcount变为1
			 * 3.执行getServletContext().setAttribute("count", totalcount+1);
			 * 4.totalcount+1变成2,交给count
			 * 
			 * ...
			*/
			Object obj = getServletContext().getAttribute("count");
			//判断count对象是否为空,如果不为空转换为整型
			int totalcount=0;
			if (obj!=null) {
				totalcount=(Integer) obj;
			}
			getServletContext().setAttribute("count", totalcount+1);
			//writer.write("login success");
			//获取状态码 302为重新向为found
			response.setStatus(302);
			//登陆成功后,跳转到success.html
			response.setHeader("Location", "success.html");
			
		}else {
			writer.write("login flase");
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
