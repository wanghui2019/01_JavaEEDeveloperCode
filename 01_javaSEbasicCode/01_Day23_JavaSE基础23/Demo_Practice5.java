package com.test23;

public class Demo_Practice5 {
	/*
	 * 一对刚出生的小兔,一个月长成大兔,再过一个月就能生下一对小兔,问一年能有多少对兔子
	 * 分析:
	 * 1  1  2  3  5  8...
	 * 1=fun(1);              1
	 * 1=fun(2);              2
	 * 2=fun(1)+fun(2);       3
	 * 3=fun(2)+fun(3);       4
	 * ...
	 */
	public static void main(String[] args) {
		//第一种方法:使用数组
		//Demo1();
		//第二种方法:使用递归
		System.out.println(fun(12));    //传入月份
	}

	public static int fun(int i) {
			if (i==1||i==2) {           //i是1或者2都返回1
				return 1;
			}else {                     //否则递归运算
				return fun(i-1)+fun(i-2);
			}
		}

	private static void Demo1() {
		int[] arr=new int[12];       
		arr[0]=1;
		arr[1]=1;
		for (int i = 2; i < arr.length; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println(arr[arr.length-1]);
	}

}
