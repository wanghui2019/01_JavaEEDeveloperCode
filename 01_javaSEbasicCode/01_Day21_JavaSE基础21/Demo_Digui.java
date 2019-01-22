package com.test21;

import java.io.File;
import java.util.Scanner;

public class Demo_Digui {
	/*
	 * 从键盘上录入一个文件夹路径,返回这个文件夹下所有的.java文件
	 * 分析:
	 * 1.获取一个文件夹路径,并返回能被递归调用
	 * 2.遍历该文件夹路径下的文件,如果是文件且后缀是.java,输出
	 * 3.如果是文件夹,递归调用
	 */
	public static void main(String[] args) {
		File file=getDir();
		getJava(file);
		
	}
	public static File getDir() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String str=sc.nextLine();
			File file=new File(str);
			if (!file.exists()) {                //判断文件是否存在
				System.out.println("no file");
			}else if (file.isFile()) {           //判断是否是文件
				System.out.println("is file");
			}else {
				return file;                     //是文件夹,就返回
			}
		}
	}
	public static void getJava(File file) { 
		File[] subfiles=file.listFiles();       //遍历文件夹
		for (File subfile : subfiles) {
			//如果是文件并且是以.java结尾的,就打印输出
			if (subfile.isFile() && subfile.getName().endsWith(".java")) {
				System.out.println(file);
			}else if (subfile.isDirectory()) {           //如果是文件夹,就递归调用
				getJava(subfile);
			}
		}
			
	}
}

