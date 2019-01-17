package com.test16;

import java.util.ArrayList;

public class Demo_SingleBasic {
	/*
	 * 去除集合中的重复元素
	 * 分析:
	 * 可以定义一个新的集合用于接受
	 * 1.先创建一个存储重复元素的老的集合
	 * 2.调用方法single(),该方法将老集合中的元素去除重复,保存到一个新的集合中
	 * 3.打印新集合
	 */
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();   //创建ArrayList集合对象
		list.add("a");                                    //添加元素
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		System.out.println(list);                         //打印最初集合
		ArrayList<String> newlist=single(list);           //调用single()方法             
		System.out.println(newlist);
	}
		public static ArrayList<String> single(ArrayList<String> list) {  
			ArrayList<String> newlist=new ArrayList<String>();   //创建新对象
			for (int i = 0; i < list.size(); i++) {              //遍历
				Object obj=list.get(i);                          //获取各个元素
				if (!newlist.contains(obj)) {                    //如果新集合不包含该元素,就添加
					newlist.add((String)obj);
				}
			}
			return newlist;                                      //返回新集合
		}
}
