package com.test17;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo_DeleteJH {
	/*
	 * 将集合中的重复元素去掉
	 */
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("a");
		al.add("b");
		al.add("b");
		al.add("b");
		al.add("c");
		
		HashSet<String> hs=new HashSet<String>();
		for (String string : al) {
			hs.add(string);
		}
		
		System.out.println(hs);
	}

}
