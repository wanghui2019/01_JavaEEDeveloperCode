package com.test16;

import java.util.ArrayList;

import com.persion16.Persion;

public class Demo_SingleObj {

	public static void main(String[] args) {
		/*
		 * 去除集合中的重复对象
		 * 分析:
		 * 可以定义一个新的集合用于接受
		 * 1.先创建一个存储重复元素的老的集合
		 * 2.调用方法single(),该方法将老集合中的元素去除重复,保存到一个新的集合中
		 * 3.打印新集合
		 */
			ArrayList<Persion> list=new ArrayList<Persion>();   //创建ArrayList集合对象
			list.add(new Persion("zhangsan", 23));                                    //添加元素
			list.add(new Persion("zhangsan", 23));
			list.add(new Persion("zhangsan", 23));
			list.add(new Persion("lisi", 24));
			list.add(new Persion("lisi", 24));
			System.out.println(list);                         //打印最初集合
			ArrayList<Persion> newlist=single(list);           //调用single()方法             
			System.out.println(newlist);
		}
			public static ArrayList<Persion> single(ArrayList<Persion> list) {  
				ArrayList<Persion> newlist=new ArrayList<Persion>();   //创建新对象
				for (int i = 0; i < list.size(); i++) {              //遍历
					Object obj=list.get(i);                          //获取各个元素
					if (!newlist.contains(obj)) {                    //contains底层依赖equals
						//Persion类中必须重写equals,否则contains依赖Object类里的equals方法比较地址值
						newlist.add((Persion)obj);
					}
				}
				return newlist;                                      //返回新集合
			}
	}

