package com.test13;

public class Demo_Change13 {
	/*
	 * 将数组转换成字符串
	 * 例如int[] arr={1,2,3};
	 * 转换为[1,2,3]
	 * 使用StringBuffer实现
	 */
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		StringBuffer sb=new StringBuffer();   // 创建StringBuffer对象
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {    //遍历
			if (i<arr.length-1) {
				sb.append(arr[i]+",");
			}else {
				sb.append(arr[i]+"]");
			}	
		}
		System.out.println(sb);
	}

}
