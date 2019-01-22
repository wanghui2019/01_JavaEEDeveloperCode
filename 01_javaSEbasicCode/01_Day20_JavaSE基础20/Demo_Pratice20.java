package com.test20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo_Pratice20 {
	/*
	 * 键盘录入数据copy到test.txt文本中,当遇到quit是停止
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);        //创建键盘录入对象
		FileOutputStream fos=new FileOutputStream("test.txt",true);    //创建输出流对象,追加形式
		while(true) {
			String line=sc.nextLine();            
			if (!"quit".equals(line)) {           //如果不为quit
				fos.write(line.getBytes());	      //写入
				fos.write("\r\n".getBytes());
			}else {
				break;                            //否则跳出循环
			}	
		}
		fos.close();                               //关流
	}
}
