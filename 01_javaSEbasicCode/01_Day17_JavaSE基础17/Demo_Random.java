package com.test17;

import java.util.HashSet;
import java.util.Random;

public class Demo_Random {
	/*
	 * 产生10个1~20之间的随机数,要求随机数不能重复
	 * 1.先创建随机数对象
	 * 2.使用HashSet集合
	 */
	public static void main(String[] args) {
		Random r=new Random();                       //创建随机数对象
		HashSet<Integer> hs=new HashSet<Integer>();  //创建HashSet对象
		while (hs.size()<10) {                       //如果HashSet里存的元素不到10
			hs.add(r.nextInt(20)+1);                 //添加1~20之间的元素
		}
		for (Integer integer : hs) {                 //遍历
			System.out.println(integer);
		}
	}

}
