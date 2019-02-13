package com.day02.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletConfig extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		//该名称是web.xml文件servlet-name里的名称
		String servletName = config.getServletName();
		System.out.println(servletName);
		//根据init-param元素下的param-name里的键获取param-value里的值
		String initParameter = config.getInitParameter("name");
		System.out.println(initParameter);
		//获取配置的初始化文件中所有的键的枚举
		Enumeration<String> initParameterNames = config.getInitParameterNames();
		//遍历
		while (initParameterNames.hasMoreElements()) {
			//获取键
			String key = (String) initParameterNames.nextElement();
			//获取值
			String value = config.getInitParameter(key);
			System.out.println("key"+key+"  "+"value"+value);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req,resp);
	}
	
}
