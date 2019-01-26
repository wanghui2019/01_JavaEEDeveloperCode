package com.test25;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo_Test25 {
	public static void main(String[] args) {
		Printer p=new Printer();
		new Thread() {
			public void run() {
				try {
					for (int i = 0; i < 100; i++) {
						p.print1();
					}	
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					for (int i = 0; i < 100; i++) {
						p.print2();
					}
				} catch (InterruptedException e) {	
					e.printStackTrace();
				}
			}
		}.start();
	}
}
class Printer{
	private ReentrantLock reen=new ReentrantLock();
	private Condition c1=reen.newCondition();
	private Condition c2=reen.newCondition();
	private int flag=1;
	public void print1() throws InterruptedException{
		reen.lock();
		if (flag!=1) {
			this.wait();
		}
		System.out.print("你");
		System.out.print("好");
		System.out.println();
		flag=2;
		c2.signal();
		reen.unlock();	
	}
	public synchronized void print2() throws InterruptedException{
		reen.lock();
			if (flag!=2) {
				c2.await();
			}
			System.out.print("我");
			System.out.print("也");
			System.out.print("好");
			System.out.println();
			flag=1;
			c1.signal();
			reen.unlock();	
	}
}


