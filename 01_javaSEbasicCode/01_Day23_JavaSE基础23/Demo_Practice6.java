package com.test23;

import java.math.BigInteger;
import java.util.HashMap;

public class Demo_Practice6 {
	/*
	 * 求出1000的阶层所有0与尾部0的个数
	 */
	public static void main(String[] args) {
		int[] arr=new int[1000];
		String s="1";
		BigInteger bi=new BigInteger(s);
		for (int i = 1; i <= arr.length; i++) {
			String s1=Integer.toString(i);
			BigInteger bi1=new BigInteger(s1);
			bi=bi1.multiply(bi);
		}
		String str=bi.toString();
		char[] ch=str.toCharArray();
		int snum=0;
		for (char c : ch) {
			if (c=='0') {
				snum++;
			}
		}
		System.out.println(snum);
	}

}
