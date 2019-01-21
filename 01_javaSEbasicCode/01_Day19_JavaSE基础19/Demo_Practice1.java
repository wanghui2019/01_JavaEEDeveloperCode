package com.test19;

import java.io.File;

public class Demo_Practice1 {
	/*
	 * 获取指定目录下指定后缀的文件
	 * 获取/Users/yh/Downloads下后缀为.dmg的文件
	 */
	public static void main(String[] args) {
		File file=new File("/Users/yh/Downloads");    //创建路径对象
		File[] filearr=file.listFiles();              //得到路径对象下的所有文件和文件夹
		for (File file2 : filearr) {                  //遍历
			if (file2.isFile()) {                     //如果是文件
				if (file2.getName().endsWith(".dmg")) {     //如果是以.dmg结尾的
					System.out.println(file2);        //打印输出
				}
			}
		}
	}
}
