package com.test16;

import java.util.ArrayList;

import com.persion16.Persion;

public class Demo_ArrayListAL {
	/*
	 * 集合嵌套:ArrayList嵌套ArrayList
	 * 案例:
	 * 年级是个大集合,里面包含了很多班级,班级属于集合ArrayList类
	 * 班级是一个小集合,里面包含了很多学生,学生属于Persion类
	 */
	public static void main(String[] args) {
		//班级是一个小集合,里面包含了很多学生
		ArrayList<Persion> classone=new ArrayList<Persion>();   //一班
		classone.add(new Persion("杨幂",23));                   //一班成员
		classone.add(new Persion("郭德纲",40));
		classone.add(new Persion("华晨宇",20));
		classone.add(new Persion("洋洋",25));
		
		ArrayList<Persion> classtwo=new ArrayList<Persion>();   //二班
		classtwo.add(new Persion("路飞",17));                   //二班成员
		classtwo.add(new Persion("鸣人",28));
		classtwo.add(new Persion("孙悟空",500));
		classtwo.add(new Persion("猪八戒",300));
		
		ArrayList<ArrayList<Persion>> subject=new ArrayList<ArrayList<Persion>>();  //年级对象
		subject.add(classone);                                 //添加一班成员
		subject.add(classtwo);                                 //添加二班成员
		
		for (ArrayList<Persion> arrayList : subject) {         //遍历班级
			for (Persion persion : arrayList) {                //遍历学生
				System.out.println(persion);
			}
		}
		
		
	}
}
