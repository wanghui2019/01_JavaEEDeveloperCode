package com.test15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo_World {
	/*
	 * 我有一个集合,我要判断其中有没有“World”这个元素,如果有将其替换为“java”,如果没有,返回-1
	 * 分析:
	 * 假如集合为:[111,tree,645i,World,world]
	 * 1.先对集合进行遍历
	 * 2.判断遍历的集合元素是否有World,如果有,替换为java
	 * 3.如果没有,返回-1
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);      //创建键盘录入对象
		@SuppressWarnings("rawtypes")
		List list=new ArrayList();              //父类引用指向子类对象
		list.add(sc.nextLine());                //添加键盘录入对象到list中
		list.add(sc.nextLine());
		list.add(sc.nextLine());
		list.add(sc.nextLine());
		list.add(sc.nextLine());
		System.out.println(list);               //打印出最初的集合对象
		int b=method(list);                     //调用此方法判断是否有"World"
		if (b!=-1) {                           
			list.set(b, "java");                //如果有,将其替换为"java"
		}else {
			System.out.println("no World");     //如果没有,打印出"no World"
		}
		System.out.println("Replacement position:"+b);    //将要替换的索引位置打印出来           
		System.out.println(list);               //将替换后的集合打印出来
	}
	/*
	 * 判断是否有"World",如果有,返回其索引值,否则返回-1
	 * 返回值类型int类型
	 * 参数列表List list
	 */
	@SuppressWarnings("rawtypes") 
	public static int method(List list) {
		for (int i = 0; i < list.size(); i++) {   //遍历list集合
			String s=(String)(list.get(i));       //根据索引得到集合元素并强转为String类型
			if ("World".equals(s)) {              //判断是否有"World",如果有
				return i;                         //返回对用索引值
			}
		}
		return -1;	                              //否则,返回-1
	}
}
