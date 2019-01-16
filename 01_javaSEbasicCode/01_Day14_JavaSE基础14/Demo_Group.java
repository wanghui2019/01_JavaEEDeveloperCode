package com.test14;

public class Demo_Group {
	/*
	 * 切割重复字符得到“我爱你中国”
	 * 我....我...我..爱.....爱....你.....你你你....中..国....国...
	 * 分析:
	 * 1.先把“.”使用“”给替换掉
	 * 2.使用原数据替换掉重复部分(.)\\1+
	 */
	public static void main(String[] args) {
		String s="我....我...我..爱.....爱....你.....你你你....中..国....国...";
		//1.先把“.”使用“”给替换掉
		String s1=s.replaceAll("\\.", "");
		//2.使用原数据替换掉重复部分(.)\\1+
		String s2=s1.replaceAll("(.)\\1+", "$1");   //$1表示第一组的原数据
		System.out.println(s2);
	}

}
