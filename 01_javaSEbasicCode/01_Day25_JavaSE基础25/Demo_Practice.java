package com.test25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Demo_Practice {
	/*
	 * 模拟购物过程
	 * 分析:
	 * 1.看商品总类
	 * 2.选择商品,要求实时显示商品的总价
	 * 3.选择的不想要的商品可以放回
	 * 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入查看商品总类:");
		while(true) {
			String line=sc.nextLine();
			if (line.equals("查看商品总类")) {
				lookStore();
				break;
			}else {
				System.out.println("未知命令");
			}
		}
		HashMap<String,String> mystores=selectStore();
		double sum=0;
		Set<String> keys=mystores.keySet();
		for (String key : keys) {
			String value=(String) mystores.get(key);
			System.out.println(key+"="+value);
			double doublevalue=Double.parseDouble(value);
			sum=sum+doublevalue;
		}
		System.out.println("商品总价为:"+sum);
		
		//不想要某个商品了,删除
		System.out.println("请使用delete商品名称的格式删除商品");
		while(true) {
			HashMap<String,String> nowstores=deleteStores(mystores);
			Set<String> nowkeys=nowstores.keySet();
			for (String nowkey : nowkeys) {
				if (nowkey!=null) {
					String nowvalue=(String) nowstores.get(nowkey);
					System.out.println(nowkey+"="+nowvalue);
				}else {
					System.out.println("已经没有商品了");
					break;
				}	
			}
		}
		
	}
	
	//不想要某个商品了,删除
	public static HashMap<String,String> deleteStores(HashMap<String, String> mystores) {
		HashMap<String, String> newmystores=new HashMap<String, String>();
		Set<String> keys=mystores.keySet();
			for (String key : keys) {
				String value=(String) mystores.get(key);
				Scanner sc=new Scanner(System.in);
				String line=sc.nextLine();
				if (!line.equals("delete"+key)) {
					newmystores.put(key, value);
				}
			}
			return newmystores;	
	}


	//选择商品
	public static HashMap<String,String> selectStore() throws FileNotFoundException, IOException {
		HashMap<String, String> mystores=new HashMap<String, String>();
		Properties stores=new Properties();
		stores.load(new FileInputStream("store.properties"));
		Enumeration<String> en=(Enumeration<String>) stores.propertyNames();
		while(en.hasMoreElements()) {
			String key=en.nextElement();
			System.out.println("如果买"+key+"   请输入"+key+"  否则按enter键进行下面商品的选择");
			String value=stores.getProperty(key);
			Scanner sc=new Scanner(System.in);
			String line=sc.nextLine();
			if (key.equals(line)) {
				mystores.put(key, value);
			}
		}
		return mystores;
	}
	//查看商品总类
	public static void lookStore() throws FileNotFoundException, IOException {
		Properties stores=new Properties();       //获取属性对象
		stores.load(new FileInputStream("store.properties"));
		Enumeration<String> en=(Enumeration<String>) stores.propertyNames();
		while(en.hasMoreElements()) {
			String key=en.nextElement();
			String value=stores.getProperty(key);
			System.out.println("商品:"+key+"     价格:"+value);
		}
	}

}
