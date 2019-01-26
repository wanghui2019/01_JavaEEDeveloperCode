package com.test26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo_ReceiveUDP {
	/*
	 * 接收数据
	 */
	public static void main(String[] args) throws Exception{
		//1.创建服务器DatagramSocket+指定端口(该端口和发送端指定的服务器端口一致)
		DatagramSocket receivesocket=new DatagramSocket(6668);
		//2.创建字节数组用于接收发送来的数据
		byte[] arr=new byte[1024];
		//3.开始将数据打包,封装为DatagramPacket
		DatagramPacket receivepacket=new DatagramPacket(arr, arr.length);
		//4.开始接收
		while(true) {
			receivesocket.receive(receivepacket);
			//5.分析接收到的数据,将该数据转换为字符串
			byte[] b=receivepacket.getData();
			int len=receivepacket.getLength();
			String s=receivepacket.getAddress().getHostAddress();
			int port=receivepacket.getPort();
			System.out.println(s+"..."+port+"..."+new String(b, 0, len));
		}
		
	}

}
