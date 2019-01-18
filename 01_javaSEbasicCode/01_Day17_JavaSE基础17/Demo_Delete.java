package com.test17;

import java.util.HashSet;
import java.util.Scanner;

public class Demo_Delete {
	/*
	 * 使用键盘录入一行输入,去掉重复字符,打印出不同字符,例如:adadfhhgjdghjh
	 * 分析:
	 * 1.创建键盘录入对象
	 * 2.创建HashSet集合对象
	 * 3.对录入的字符串转换为字符数组进行遍历
	 * 4.将遍历的结果逐个添加到HashSet集合中
	 * 5.打印输出
	 */
	public static void main(String[] args) {
		//1.创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		//2.创建HashSet集合对象
		HashSet<Character> hs=new HashSet<>();
		String s=sc.nextLine();
		//3.对录入的字符串转换为字符数组进行遍历
		char[] arr=s.toCharArray();
		for (char c : arr) {
			//4.将遍历的结果逐个添加到HashSet集合中
			hs.add(c);
		}
		//5.打印输出
		System.out.println(hs);
	}

}
