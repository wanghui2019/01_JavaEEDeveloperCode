package com.test24;

public class Demo_RunnableTicket {
	/*
	 * 使用Runnable实现卖票的问题
	 */
	public static void main(String[] args) {
		//连续开启4个线程
		new Thread(new MyTicket()).start();
		new Thread(new MyTicket()).start();
		new Thread(new MyTicket()).start();
		new Thread(new MyTicket()).start();	
	}
}

class MyTicket implements Runnable{
	private static int ticket=100;
	public void run() {
		while(true) {
			synchronized (MyTicket.class) {
				if (ticket==0) {
					System.out.println("no ticket,see you tomorrow");
					break;
				}else {
					try {
						Thread.sleep(100);                  //设置睡眠时间
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"..."+ticket--+" ticket");
				}
			}	
		}
	}
}
