package com.test22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo_Test22 {
	/*
	 * 序列流
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis1=new FileInputStream("aaa.txt");        //创建输入流fis1
		FileInputStream fis2=new FileInputStream("bbb.txt");        //创建输入流fis2
		FileInputStream fis3=new FileInputStream("ccc.txt");        //创建输入流fis3
		
		Vector<FileInputStream> v=new Vector<FileInputStream>();    //创建Vector集合对象
		v.add(fis1);                                                //将流对象逐个添加到集合中
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> en=v.elements();                //将集合转换为枚举
		SequenceInputStream sis=new SequenceInputStream(en);         //将输入流全部添加到序列流中
		FileOutputStream fos=new FileOutputStream("ddd.txt");        //创建输入流fos
		int b;
		while((b=sis.read())!=-1) {									 //逐个读
			fos.write(b);                                            //逐个写
		}
		sis.close();                                                  //关流
		fos.close();												  //关流
	}

}
