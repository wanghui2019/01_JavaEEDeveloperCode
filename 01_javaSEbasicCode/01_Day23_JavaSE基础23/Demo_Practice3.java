package com.test23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo_Practice3 {
	/*
	 * 从键盘接收两个文件夹路径,将其中一个文件夹中的内容拷贝到另外一个文件夹中
	 * 分析:
	 * 1.获取正确的两个文件夹路径
	 * 2.将文件file1的内容copy到file2中,并返回
	 */
	public static void main(String[] args) throws IOException {
		File file1=getDir();
		File file2=getDir();
		//将文件file1的内容copy到file2中,并返回
		if (file1.equals(file2)) {
			System.out.println("false");
		}else {
			copy(file1,file2);
		}
	}
	/*
	 * 将文件file1的内容copy到file2中,并返回
	 * 分析:
	 * 1.在目标文件夹中创建原文件夹的目录
	 * 2.
	 */
	private static void copy(File file1, File file2) throws IOException {
		File newdir=new File(file2, file1.getName());
		newdir.mkdir();
		
		File[] sumdirs=file1.listFiles();
		for (File files : sumdirs) {
			if (files.isFile()) {
				BufferedInputStream bis=new BufferedInputStream(new FileInputStream(files));
				BufferedOutputStream bos=
						new BufferedOutputStream(new FileOutputStream(new File(file2, file1.getName())));
				int b;
				while((b=bis.read())!=-1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			}else {
				copy(files,newdir);
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
