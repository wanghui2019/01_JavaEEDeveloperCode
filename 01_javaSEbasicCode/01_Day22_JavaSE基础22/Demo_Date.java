package com.test22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo_Date {
	/*
	 * DataInputStream与DataOutputStream按基本数据类型读取
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop=new Properties();         //获取属性对象
		prop.load(new FileInputStream("test.properties"));  //将属性对象与配置文件关联起来
		System.out.println("修改前:"+prop);
		prop.setProperty("zhangsan","30");       //修改zhangsan的属性
		//此中修改只能修改prop中的数据,不能修改配置文件的数据
		System.out.println("修改后1:"+prop);
		//只有store一下才能将配置文件修改
		prop.store(new FileOutputStream("test.properties"), "change zhangsan properties");
		System.out.println("修改后2:"+prop);
	}

}
