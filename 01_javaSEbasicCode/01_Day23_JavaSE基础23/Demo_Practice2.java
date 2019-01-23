package com.test23;

import java.io.File;
import java.util.Scanner;

public class Demo_Practice2 {
	/*
	 * 从键盘接收一个文件夹路径,删除该文件夹
	 * 分析:
	 * 1.获取正确的文件夹路径
	 * 2.调用删除方法将其删除
	 */
	public static void main(String[] args) {
		//1.获取正确的文件夹路径
		File file=getDir();
		//2.调用删除方法将其文件删除
		deleteFile(file);
	}
	/*
	 * 2.调用删除方法将其文件删除
	 * 返回值类型:void
	 * 参数列表:File file
	 * 1).遍历,盘算是否为文件,如果是,删除
	 * 2)判断是否为文件夹,如果是,递归调用
	 */
	public static void deleteFile(File file) {
		//1).遍历,盘算是否为文件,如果是,删除
		File[] subfiles=file.listFiles();
		for (File subfile : subfiles) {
			if (subfile.isFile()) {
				subfile.delete();
			//2)判断是否为文件夹,如果是,递归调用
			}else{
				deleteFile(subfile);
			}
		}
		//文件被完全删除后将空文件夹删除
		file.delete();
	}
	/*
	 * 1.获取正确的文件夹路径
	 * 返回值类型:File
	 * 参数列表:void
	 */
	public static File getDir() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			File file=new File(sc.nextLine());
			if (!file.exists()) {
				System.out.println("no exists,please re-enter");
			}else if (file.isFile()) {
				System.out.println("is file,please re-enter");
			}else {
				return file;
			}
		}
	}
}