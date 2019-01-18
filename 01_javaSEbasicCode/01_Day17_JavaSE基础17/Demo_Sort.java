package com.test17;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo_Sort {
	/*
	 * 将字符串按长度进行排序
	 */
	public static void main(String[] args) {
		CompareByLen c=new CompareByLen();
		TreeSet<String> ts=new TreeSet<String>(c);
		ts.add("hello");
		ts.add("a");
		ts.add("world");
		ts.add("name");
		ts.add("age");
		ts.add("b");
		
		System.out.println(ts);
	}
}
	class CompareByLen implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			
			int num=o1.length()-o2.length();
			return num==0 ? o1.compareTo(o2) : num;
		}
		
	}


