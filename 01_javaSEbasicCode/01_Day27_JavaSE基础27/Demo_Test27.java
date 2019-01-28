package com.test27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo_Test27 {
	/*
	 * 使用反射来获取信息
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		//创建字符流缓存区得到Fruit.propertise配置文件信息
		BufferedReader br=new BufferedReader(new FileReader(new File("Fruit.propertise")));
		//读取配置文件的一行得到相应的字节码对象
		Class<?> clazz=Class.forName(br.readLine());
		//由字节码对象得到水果
		Fruit f=(Fruit) clazz.newInstance();      //Fruit f=new Apple();父类引用指向子类对象
		//创建榨汁机对象
		Juice j=new Juice();
		//开始榨汁
		j.run(f);
		//关流释放资源
		br.close();
		
		

	}
}

interface Fruit{
	public void Squeeze();
}

class Apple implements Fruit{
	@Override
	public void Squeeze() {
		System.out.println("榨一杯苹果汁");
	}	
}


class Orange implements Fruit{
	@Override
	public void Squeeze() {
		System.out.println("榨一杯橘子汁");
	}
}

class Juice{
	public void run(Fruit fruit) {
		fruit.Squeeze();
	}
}