package com.change;

public class Demo_InterceptString {
	/*
	 * 在大的字符串里统计小的字符串个数
	 * 1.定义一个count,统计个数,再定义一个index,记录小字符串出现的索引位置
	 * 2.找到大字符串里的第一个小串的索引,如果没有,值为-1
	 * 3.如果有,从索引处截取小串,然后将结果赋值给大串
	 * 4,重复3
	 */
	public static void main(String[] args) {
		String s1="abcfjghjlfjabcdjshgghabcjghh";
		String s2="abc";
		//1.定义一个index,统计个数
		int index=0;
		int count=0;
		//2.找到大字符串里的第一个小串的索引,如果没有,值为-1
		while((index=s1.indexOf(s2))!=-1) {
			count++;        //计数
			s1=s1.substring(index+s2.length());    //截取大的字符串
		}
		System.out.println(count);
	}

}
