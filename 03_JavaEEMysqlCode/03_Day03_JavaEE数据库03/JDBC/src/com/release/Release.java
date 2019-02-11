package com.release;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/*
 * 释放资源
 */
public class Release {
	static String driverurl=null;
	static String url=null;
	static String user=null;
	static String password=null;
	static{
		//获取配置文件对象
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream("jdbc.properties"));
			//prop.load(Release.class.getClassLoader().getResourceAsStream("jdbc.properties"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//配置属性
		driverurl=prop.getProperty("driverurl");
		url = prop.getProperty("url");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
	}
	public static Connection getConn(){
		//注册驱动
		//DriverManager.registerDriver(new Driver());
		Connection conn = null;
		try {
			Class.forName(driverurl);
			conn = null;
			
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
	}
	public static void releaseMethod(Connection conn,Statement st,ResultSet rs){
		closeConn(conn);
		closeSt(st);
		closeRs(rs);
	}
	public static void releaseMethod(Connection conn,Statement st){
		closeConn(conn);
		closeSt(st);
	}

	private static void closeRs(ResultSet rs) {
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			rs=null;
		}
	}

	private static void closeSt(Statement st) {
		try {
			if(st!=null){
				st.close();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			st=null;
		}
	}

	private static void closeConn(Connection conn) {
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			conn=null;
		}
	}
}
