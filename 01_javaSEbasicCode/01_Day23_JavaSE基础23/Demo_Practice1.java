package com.test23;

import java.io.File;
import java.util.Scanner;

public class Demo_Practice1 {
	/*
	 * 需求:从键盘上录入一个文件夹文件,统计该文件夹的大小
	 * 分析:
	 * 1.创建键盘录入对象
	 * 2.写一个方法,判断是否是文件夹
	 * 3.再写一个方法,判断子文件夹是否是文件,如果是,统计大小,并记录,如果不是,调用自己
	 */
	public static void main(String[] args) {
		File file=getDir();
		long num=countDir(file);
		System.out.println(num);
	}
	/*
	 * 判断子文件夹是否是文件,如果是,统计大小,并记录,如果不是,调用自己
	 * 返回值类型:long型
	 * 参数列表:file
	 */
	public static long countDir(File file) {
		long sum=0;
		//得到字文件夹数组
		File[] subfiles=file.listFiles();
		//遍历文件数组
		for (File subfile : subfiles) {
			//是文件就求和
			if (subfile.isFile()) {
				sum=subfile.length()+sum;
			//否则递归调用
			}else {
				sum=sum+countDir(subfile);
			}
		}
		return sum;
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
