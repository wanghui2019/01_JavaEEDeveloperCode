package com.test24;

public class Demo_Ticket {
	/*
	 * 铁路卖票问题,有四个窗口,卖完100张票
	 */
	public static void main(String[] args) {
		Ticket t1=new Ticket();       //定义线程对象
		Ticket t2=new Ticket();
		Ticket t3=new Ticket();
		Ticket t4=new Ticket();
		
		t1.start();                   //开启线程
		t2.start();
		t3.start();
		t4.start();
	}
}
class Ticket extends Thread{
	private static int ticket=100;                 //设置一个静态局部变量
	public void run() {                            //重写run()方法
		while(true) {
			synchronized(Ticket.class) {
				if (ticket==0) {                       //票为0,终止循环
					System.out.println("票卖完了");
					break;	
				}else {                                //票不为0,执行--
					try {
						Thread.sleep(100);              //睡一下
						//睡一下就会出问题了.如果4条线程有不止一个同时在这里睡,当睡醒时就会执行下面的输出语句
					} catch (InterruptedException e) {	
						e.printStackTrace();
					}
					//睡完后执行,如果从1开始--,那么线程睡的线程数一旦多时,就会--到负数
					//负数在循环里判断发现不为0,就一直向下执行了
					System.out.println(this.getName()+"..."+ticket--+"张票");
				}
			}
			
		}
	}
}
