package com.test26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo_ServerMoreThread {
	/*
	 * 服务器都是多线程的
	 * 一下代码可以直接读取字符
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket=new ServerSocket(6660);   
		Socket socket=serversocket.accept();
		while(true) {
			//每接收一个客户端,就开启一条线程
			new Thread() {
				public void run() {
					try {
						//缓存字符可以里的readLine()方法可以整行的读,InputStreamReader可以将字节转换为字符
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						/*
						BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
						//下面两行是服务器写给客户端的
						bw.write("欢迎来到影响联盟");               //向客户端写
						bw.newLine();                             //换行,为了让客户端读时的readLine()方法能识别到换行
						//下面一行是服务器从客户端读的
						System.out.println(br.readLine());        //服务器读取客户端的readLine()
						*/
						//获取打印字节输出流
						PrintStream ps = new PrintStream(socket.getOutputStream());
						//PrintStream下的println方法可以直接打印字符串,而且自带换行的功能
						ps.println("可以直接打印字符串");
						//下面一行是服务器从客户端读的
						System.out.println(br.readLine());   //服务器读取客户端的readLine()
					} catch (IOException e) {	
						e.printStackTrace();
					}
				}	
			}.start();
		}
	}
}
