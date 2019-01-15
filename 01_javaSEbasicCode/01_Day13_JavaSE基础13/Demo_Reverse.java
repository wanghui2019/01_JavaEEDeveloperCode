package com.test13;

import java.util.Scanner;

public class Demo_Reverse {
	/*
	 * 键盘录入一行字符串,然后实现其功能的反转
	 * 使用StringBuffer实现
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);    //创建键盘录入对象
		StringBuffer sb=new StringBuffer(sc.nextLine());    //将String对象转换为String
		System.out.println(sb.reverse());     //反转
	}

}
