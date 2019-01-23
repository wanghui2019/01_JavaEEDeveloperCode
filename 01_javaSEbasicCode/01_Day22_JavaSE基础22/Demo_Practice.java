package com.test22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.persion.Persion;

public class Demo_Practice {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//创建对象写入流
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("fff.txt"));
		//创建集合并添加对象元素
		ArrayList<Persion> list=new ArrayList<Persion>();
		list.add(new Persion("zhangsan",23));
		list.add(new Persion("lisi",24));
		list.add(new Persion("wangwu",25));
		list.add(new Persion("zhaoliu",26));
		//将集合写入到fff.txt文件里
		oos.writeObject(list);
		//创建对象输出流
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("fff.txt"));
		//创建一个新的集合,用于接收fff.txt文件的内容
		ArrayList<Persion> newlist=new ArrayList<Persion>();
		//将接收的内容强转为集合
		newlist=(ArrayList<Persion>) ois.readObject();
		//对集合进行遍历
		for (Persion persion : newlist) {
			System.out.println(persion);
		}
		//关流
		oos.close();
		ois.close();
		
	}

}
