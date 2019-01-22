package com.test21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class Demo_Practice21 {
	/*
	 * 获取文本上每个字符出现的次数,并将统计结果保存在文本time.txt里
	 * 分析:
	 * 1.先读一个文本
	 * 2.读文本的每一个字符
	 * 3.创建一个双列集合对象
	 * 4.判断文本的字符是否包含在集合里,如果不包含,添加进去,如果包含,将值加1
	 * 5.遍历集合,将集合里的键值写入到文本time.txt里
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader fr=new BufferedReader(new FileReader("mmm.txt"));
		HashMap<Character, Integer> list=new HashMap<Character, Integer>();
		int b;
		while((b=fr.read())!=-1) {
			char key=(char)b;
			if(!list.containsKey(key)) {    //不包含时存键和1,包含时不执行下面一步
				list.put(key, 1);
			}else {
				list.put(key, list.get(key)+1); //包含时存key, list.get(key)+1
			}	
		}
		fr.close();                        //关输入流
		BufferedWriter fw=new BufferedWriter(new FileWriter("time.txt")); 
		Set<Character> keyarr=list.keySet();     //获取键集合
		for (Character wkey : keyarr) {          //遍历
			int wvalue=list.get(wkey);           //获取值
			switch (wkey) {
			case '\t':                           //判断其是制表符,跳隔符
				fw.write("\\t"+"="+wvalue);
				break;
			case '\r':                            //判断其是回车符
				fw.write("\\r"+"="+wvalue);
				break;
			case '\n':                            //判断其是换行符
				fw.write("\\n"+"="+wvalue);
				break;
			default:
				fw.write(wkey+"="+wvalue);           //写入文本
				break;
			}
			fw.newLine();                        //换行
		}
		fw.close();                              //关流
	}

}
