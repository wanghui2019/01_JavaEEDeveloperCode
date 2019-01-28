package com.test27;

public class Demo_Practice {
	/*
	 * 以计算代码运行时间为例
	 */
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.getTime());
		
	}
}
abstract class GetTime{                         //方法是抽象的,类也必须是抽象的
	public final long getTime() {               //为了防止子类随便修改父类方法
		long start=System.currentTimeMillis();  //获取代码运行前时间
		timeCode();                             //运行的代码
		long end=System.currentTimeMillis();    //获取代码运行后时间
		return end-start;                       //将时间差返回
	}
	//将方法定义为抽象的,这个方法必须被重写,可以让子类对这个方法发扬光大
	public abstract void timeCode();
}
class Demo extends GetTime{
	@Override
	public void timeCode() {                    //这个方法里可以写任何想要的东西
		for (int i = 0; i < 100000; i++) {
			System.out.println("111");
		}
	}	
}


