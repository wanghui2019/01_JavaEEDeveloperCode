package com.shop.select;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Shop_Servlet
 */
public class Shop_Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int value = Integer.valueOf(request.getParameter("id"));
		String[] names= {"苹果手机","卫龙小辣条","海贼王手办","小米手机","奥迪汽车"};
		String name=names[value];
		//存的时候形式上:map形式存入到Session上
		Map<String, Integer> map= (Map<String, Integer>) request.getSession().getAttribute("name");
		
		//判断Session里是否有map集合
		
		if (map==null) {
			//如果没有map,就创建一个map对象,加入到Session中
			map=new HashMap<String, Integer>();
			request.getSession().setAttribute("name", map);
			map.put(name, 1);
		}else {
			//判断map集合中是否有元素
			if (map.containsKey(name)) {
				//已经有,就在原来的基础上+1
				map.put(name, map.get(name)+1);
			}else {
				//没有,就添加该物品,值为1
				map.put(name, 1);
			}
		}
		response.sendRedirect("function.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
