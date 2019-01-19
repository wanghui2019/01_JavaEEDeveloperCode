package com.test18;

import java.util.HashMap;

public class Demo_Count {
	/*
	 * 使用键值对来统计一个字符串中各字符出现的次数
	 * 1.先把字符串转换为字符数组
	 * 2.创建一个HashMap集合进行存储键值对对象
	 * 3.对字符数组进行遍历
	 * 4.判断字符是否在集合中,如果没有,存储进去
	 */
	public static void main(String[] args) {
		String s="aaaaaaaffffffghhhhhfggghb";
		//1.先把字符串转换为字符数组
		char[] arr=s.toCharArray();
		//2.创建一个HashMap对象进行存储键值对对象
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		//3.对字符数组进行遍历
		for (char c : arr) {
			//4.判断字符是否在集合中,如果没有,存储进去
			if (!hs.containsKey(c)) {
			
				hs.put(c, 1);
			}else {
				hs.put(c, hs.get(c)+1);
			}
		/*
		hs.put(c,!hs.containsKey(c) ? 1 : hs.get(c)+1);
		*/	 
		}
		System.out.println(hs);
	}

}
