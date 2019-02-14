package com.myweb.myservlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Download_Test
 */
public class Download_Test extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String massage = request.getParameter("massage");
		
		ServletContext servletContext = getServletContext();
		String path = servletContext.getRealPath("download/"+massage);
		response.setHeader("Content-Disposition", "attachment;massage="+massage);
		InputStream is=new FileInputStream(new File(path));
		OutputStream os = response.getOutputStream();
		int len;
		byte[] arr=new byte[1024*8];
		while((len=is.read(arr))!=-1) {
			os.write(arr, 0, len);
		}
		is.close();
		os.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
