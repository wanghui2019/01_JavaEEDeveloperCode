package com.test17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo_SortInt {
	/*
	 * 程序启动后,可以从键盘输入接受多个整数,直到输入quit时结束输入.把所有输入的整数从小到大排列
	 * 分析:
	 * 1.创建键盘录入对象
	 * 2.在键盘上无限次的输入整数,直到遇到quit结束循环
	 * 3.如果是,存储到集合TreeSet中
	 */
	public static void main(String[] args) {
		//1.创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<Integer>();
		//2.在键盘上无限次的输入整数,直到遇到quit结束循环
		while (true) {
			String s=sc.nextLine();
			if ("quit".equals(s)) {
				break;
			}else {
				//3.如果是,存储到集合TreeSet中
				int i=Integer.parseInt(s);
				ts.add(Integer.valueOf(i));
			}	
		}	
		TreeSet<Integer> list=new TreeSet<Integer>(new IntCompare());   //创建list集合对象
		list.addAll(ts);                         //将ts集合添加到list集合中
		System.out.println(list);
	}
}
/*
 * 比较器
 */
class IntCompare implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1-o2;             //按大小排序
	}	
}

