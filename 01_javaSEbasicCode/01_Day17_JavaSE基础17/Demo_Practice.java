package com.test17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo_Practice {
	/*
	 * 在一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典排序),且不能去除重复
	 * 分析:
	 * 1.将最初集合存储在?ArrayList集合中
	 * 2.创建一个方法,让其有序(字典排序),且不能去除重复
	 * 辅助图形:
	 * https://i.loli.net/2019/01/18/5c418f03ada58.png
	 */
	public static void main(String[] args) {
		//1.将最初集合存储在?ArrayList集合中
		ArrayList<String> al=new ArrayList<String>();
		al.add("d");
		al.add("d");
		al.add("a");
		al.add("c");
		al.add("b");
		al.add("c");
		
		TreeSet list=method(al);
		System.out.println(list);
	}
	/*
	 * 2.创建一个方法,让其有序(字典排序),且不能去除重复
	 * 返回值类型:TreeSet
	 * 参数列表:ArrayList list
	 */
	public static TreeSet<String> method(ArrayList<String> al) {
		TreeSet<String> ts=new TreeSet<String>(new SonCompare());  //创建TreeSet对象,并把比较器传进去
		ts.addAll(al);                   //将集合al添加到ts里
		return ts;
	}
}
//采用比较器
class SonCompare implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {   
		int num=o1.compareTo(o2);        //底层通过一种算法将o1-o2
		//o1若等于o2,即传入的字符串一样时,返回1,表示字典中的正列排序,若不相等,返回num,num<0,倒叙,num>0,正序
		return num==0 ? 1 : num;         
	}
}
