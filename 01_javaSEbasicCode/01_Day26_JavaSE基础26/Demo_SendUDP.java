package com.test26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo_SendUDP {
	/*
	 * 发送数据
	 */
	public static void main(String[] args) throws Exception {
		//1.创建客户端DatagramSocket类+指定端口
		DatagramSocket sendsocket=new DatagramSocket(6660);    //客户端指定随机的端口号
		//2.准备要发送的数据,字节数组的形式
		Scanner sc=new Scanner(System.in);
		while(true) {
			String line=sc.nextLine();
			if ("quit".equals(line)) {
				break;
			}
			//3.将数据打包,并指明要发送的数据长度以及服务器的ip地址和端口号
			DatagramPacket sendpacket=
					new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 6668);
			//4.将打包号的东西放到socket里开始发送
			sendsocket.send(sendpacket);
		}
		
		//5.关流释放资源
		sendsocket.close();
	}

}
