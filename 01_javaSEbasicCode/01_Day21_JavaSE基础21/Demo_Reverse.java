package com.test21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo_Reverse {
	/*
	 * 将一个文本的内容按行反转
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("mmm.txt"));   //创建缓存写入流文本
		ArrayList<String> list=new ArrayList<String>();                    //创建一个数组
		ArrayList<String> newlist=new ArrayList<String>();                 //创建一个新数组
		String line;
		while((line=br.readLine())!=null) {                                //读取行数
			list.add(line);                                                //添加到集合里
		}
		//System.out.println(list.size());
		for (int i =list.size()-1; i >=0; i--) {							//倒叙遍历集合
			Object[] obj=list.toArray();									//将集合里的内容转换为数组
			newlist.add((String)obj[i]);									//添加到新的集合中
		}
		for (String string : newlist) {										//遍历新集合
			System.out.println(string);										//打印输出
		}
		br.close();															//关流
	}

}
