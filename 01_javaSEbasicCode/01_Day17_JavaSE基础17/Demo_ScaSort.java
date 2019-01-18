package com.test17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo_ScaSort {
	/*
	 * 从键盘接受一个字符串,对其中的所有字符串进行排序
	 * 1.创建键盘录入对象
	 * 2.将字符串转换为字符数组
	 * 3.遍历字符数组并添加到集合ArrayList中
	 * 4.调用方法sort()进行排序
	 * 5.打印输出
	 */
	public static void main(String[] args) {
		//1.创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		//2.将字符串转换为字符数组
		char[] arr=sc.nextLine().toCharArray();
		ArrayList<Character> list=new ArrayList<Character>();
		//3.遍历字符数组并添加到集合ArrayList中
		for (Character character : arr) {
			list.add(character);
		}
		//4.调用方法sort()进行排序
		TreeSet<Character> ts=sort(list);
		//5.打印输出
		System.out.println(ts);
	}
	/*
	 * 调用方法sort()进行排序
	 * 返回值类型:TreeSet
	 * 参数列表ArrayList list
	 * 1.创建TreeSet对象,为了调用比较器排序
	 * 2.将list集合添加到ts集合中
	 * 3.将ts返回
	 */
	public static TreeSet<Character> sort(ArrayList<Character> list) {
		//1.创建TreeSet对象,为了调用比较器排序
		TreeSet<Character> ts=new TreeSet<Character>(new CompareByChar());
		//2.将list集合添加到ts集合中
		ts.addAll(list);
		//3.将ts返回
		return ts;
	}
}
/*
 * 比较器
 */
class CompareByChar implements Comparator<Character>{
	@Override
	public int compare(Character o1, Character o2) {
		int num=o1.compareTo(o2);
		//o1若等于o2,即传入的字符串一样时,返回1,表示字典中的正列排序,若不相等,返回num,num<0,倒叙,num>0,正序
		return num==0 ? 1:num;
	}
}