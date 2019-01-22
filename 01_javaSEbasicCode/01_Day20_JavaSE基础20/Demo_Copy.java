package com.test20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo_Copy {
	/*
	 * 在控制台录入一个文件的路径,将次文件复制到当前目录下
	 * 分析:
	 * 1.在控制台上录入一个路径字符串
	 * 2.将此字符串封装为一个File文件
	 * 3.创建流对象进行读写copy
	 */
	public static void main(String[] args) throws IOException {
		//1.在控制台上录入一个路径字符串
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//2.将此字符串封装为一个File文件
		File file=new File(s);
		//3.创建流对象进行读写copy
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fos=new FileOutputStream("mmm.png");
		int len;
		byte[] arr=new byte[1024*8];
		while((len=fis.read(arr))!=-1) {
			fos.write(arr,0,len);
		}
		fis.close();
		fos.close();
	}

}
