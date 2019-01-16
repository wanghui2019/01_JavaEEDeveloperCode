package com.test14;

import java.util.Arrays;

public class Demo_Sort {
	/*
	 * 给定一个字符串“3 4 6 1 2”,请将代码输出结果为“1 2 3 4 6”
	 * 分析:
	 * 1.先进行分割为字符串数组
	 * 2.把字符串数组转换为整数数组
	 * 3.对整数数组进行排序
	 * 4.再转换为字符串数组
	 */
	public static void main(String[] args) {
		String s="3 4 6 1 2";
		//1.先进行分割为字符串数组
		String[] sarr=s.split(" ");
		int[] iarr=new int[sarr.length];
		for (int i = 0; i < sarr.length; i++) {
			//2.把字符串数组转换为整数数组
			iarr[i]=Integer.parseInt(sarr[i]);
		}
		//3.对整数数组进行排序
		Arrays.sort(iarr);
		//4.再转换为字符串数组
		for (int i = 0; i < iarr.length; i++) {
			if (i<iarr.length-1) {
				System.out.print(iarr[i]+" ");
			}else {
				System.out.print(iarr[i]);
			}	
		}	
	}

}
