<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<a href="ClearCart"><h1>清除购物车</h1></a>
		
	<%
		//获取Session,然后根据键获取相应的map集合
		Map<String, Integer> map= (Map<String, Integer>) request.getSession().getAttribute("name");
		//遍历map集合,取键值对
		if(map!=null){
			for(String key:map.keySet()){
				int value=map.get(key);
	%>
		<h3>商品名称:<%=key %>   商品数量:<%=value %></h3>
						
	<%
			}
		}else{
			
		}
	%>
</body>
</html>