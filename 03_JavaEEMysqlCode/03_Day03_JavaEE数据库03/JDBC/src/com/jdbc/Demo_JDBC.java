package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.release.Release;

public class Demo_JDBC {

	public static void main(String[] args) {
		Connection conn=null;
		
		Statement st=null;
		try {
			conn=Release.getConn();
			//获得statement对象
			st = conn.createStatement();
			//执行查询，得到结果集
			String sql="delete from product where name='哈哈'";
			int res = st.executeUpdate(sql);
			//对查询结果进行遍历
			if(res>0){
				System.out.println("添加成功");
			}else{
				System.out.println("添加失败");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Release.releaseMethod(conn, st);
		}
	}
}
