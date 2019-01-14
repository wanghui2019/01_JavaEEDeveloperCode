package com.landing;

import java.util.Scanner;

public class Demo_Landing {
	/*
	 * 模拟用户登陆,一共有10次登陆机会,并且提示还剩几次
	 * 登陆名和密码都是admin
	 * 
	 * 1.创建键盘录入登陆
	 * 2.如果登陆名不为admin,登陆失败,重新输入
	 * 3.否则,提示请输入密码
	 * 4.重新创建键盘录入对象,录入密码
	 * 5.如果密码输入错误,要求重新输入,并提示剩余次数,当机会用完后,提示明天再来吧
	 * 6.否则,提示恭喜登陆成功
	 */
	public static void main(String[] args) {
		//1.创建键盘录入登陆
		Scanner name=new Scanner(System.in);
		//2.如果登陆名不为admin,登陆失败,重新输入
		while(!name.nextLine().equals("admin")) {          // 录入用户名不等于admin
			System.out.println("flase,please return enter");    //提示用户名不正确
		}
		//3.否则,提示请输入密码
		System.out.println("please enter your password");  //否则,录入正确
		
		//4.重新创建键盘录入对象,录入密码
		Scanner password=new Scanner(System.in);
		int frequenty=10;                    //定义一个索引,共10次输入次数
		//5.如果密码输入错误,要求重新输入,并提示剩余次数,当机会用完后,提示明天再来吧
		while(!password.nextLine().equals("admin")) {
			System.out.println("your password is false,your remaining times is:"+(--frequenty));
			if(frequenty==0) {                //输入次数用完
				System.out.println("please see you tomorrow");
				break;                       //跳出循环
			}
		}
		//6.否则,提示恭喜登陆成功
		if(frequenty!=0) {                   
			System.out.println("Congratulations on landing successfully");
		}	
	}
}
