package com.day02.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("helloweb初始化");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("helloweb被调用了");
	}

	@Override
	public void destroy() {
		System.out.println("helloweb被销毁了");
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	
}
