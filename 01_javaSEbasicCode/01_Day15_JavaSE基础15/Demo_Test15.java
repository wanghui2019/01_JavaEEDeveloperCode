package com.test15;

import java.util.ArrayList;
import java.util.Collection;

import com.Persion.Persion;

public class Demo_Test15 {
	/*
	 * 对集合进行遍历
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Collection c=new ArrayList();   //父类引用指向之类对象
		c.add("a");                     //将元素添加到c对象中
		c.add("b");
		c.add("c");
		c.add("d");
		Object[] o=c.toArray();         //将集合转换为数组
		for (int i = 0; i < o.length; i++) {   //遍历
			System.out.println(o[i]);
		}
		
		@SuppressWarnings("rawtypes")
		Collection c1=new ArrayList();
		c1.add(new Persion("zhangsan",23));
		c1.add(new Persion("lisi",24));
		c1.add(new Persion("wangwu",25));
		c1.add(new Persion("zhaoliu",26));
		Object[] arr=c1.toArray();         //将集合转换为数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);    //对引用数据类型数组遍历
			System.out.println(((Persion)arr[i]).getName());   //向下转型为persion类型再调用getName方法
		}
		
	}

}
