package com.test20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Picture {
	/*
	 * copy一副图片
	 */
	public static void main(String[] args) throws IOException {
		//创建输入流对象,关联/Users/yh/Desktop/01_Day19_JavaSE基础19.png
		FileInputStream fis=new FileInputStream("/Users/yh/Desktop/01_Day19_JavaSE基础19.png");
		//创建输出流对象,关联mmm.png
		FileOutputStream fos=new FileOutputStream("mmm.png");
		int b;
		while((b=fis.read())!=-1) {   //不断的读取数据
			fos.write(b);             //不断的写入数据
		} 
		fis.close();                  //关闭输入流
		fos.close();	              //关闭输出流
	}

}
