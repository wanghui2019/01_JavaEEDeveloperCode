package com.test19;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Demo_Practice {
	/*
	 * 键盘录入一个整数,并将其转换为二进制形式
	 * 如果录入过大,给予提示说这是个BigInteger类型的整数
	 * 如果录入的是小数,给予提示,录入的是小数
	 * 如果录入的是其它字符,给予提示录入的是其它字符
	 * 1.创建键盘录入对象
	 * 2.录入一个字符串,并将其转换为整数
	 * 3.如果转换不过去,try一下,判断是否能转换为大整型
	 * 4.如果不行,在try一下,判断是否能转换为小数类型
	 * 5,如果不行,就是其它字符
	 */
	public static void main(String[] args) {
		//1.创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		while(true) {
			String line=sc.nextLine();
			try {
				//2.录入一个字符串,并将其转换为整数
				int num=Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));
				break;
			}catch(Exception e1){
				//3.如果转换不过去,try一下,判断是否能转换为大整型
				try {
					new BigInteger(line);
					System.out.println("数太大,重新录:");
				}catch(Exception e2) {
					//4.如果不行,在try一下,判断是否能转换为小数类型
					try {
						new BigDecimal(line);
						System.out.println("这是小数,重新录入:");
					}catch(Exception e3) {
						//5,如果不行,就是其它字符
							System.out.println("这是其它字符,重新输入");
						}	
					}	
				}
			}	
	}	
}
