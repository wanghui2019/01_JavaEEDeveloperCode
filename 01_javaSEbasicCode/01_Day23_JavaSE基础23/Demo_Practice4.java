package com.test23;

import java.io.File;
import java.util.Scanner;

public class Demo_Practice4 {
	/*
	 * 从键盘接收一个路径,将该文件夹下的所有文件和文件夹路径按层级打印出来
	 * 分析:
	 * 将该文件夹下的所有文件和文件夹路径按层级打印出来
	 * 1.写个方法,遍历,判断是否是文件,如果是,将名称打印出来
	 * 2.如果不是,将文件夹名称打印出来
	 * 3.对文件夹进行递归调用
	 */
	public static void main(String[] args) {
		File file=getDir();
		printName(file,0);
	}
	/*
	 * 将该文件夹下的所有文件和文件夹路径按层级打印出来
	 */
	public static void printName(File file,int lev) {
		File[] subfiles=file.listFiles();
		for (File subfile : subfiles) {
			for (int i = 0; i <=lev; i++) {       //lev用于增加每次递增时的\t次数
				System.out.print("\t");
			} 
			System.out.println(subfile);
			if (subfile.isDirectory()) {
				printName(subfile,lev);
			}
		}
	}
	/*
	 * 判断是否是文件夹
	 * 返回值类型:File
	 * 参数列表:空
	 */
	public static File getDir() {
	//创建键盘录入对象
	Scanner sc=new Scanner(System.in);
	//无限循环
		while(true) {
			String str=sc.nextLine();
			//将键盘录入的对象转换为File类型
			File file=new File(str);
			//判断文件是否存在
			if (!file.exists()) {
				System.out.println("no exists,please re-enter");
				//判断是否是文件
			}else if (file.isFile()) {
				System.out.println("is file,please re-enter");
				//如果是文件夹,就返回
			}else {
				return file;
			}
		}
	}
}
