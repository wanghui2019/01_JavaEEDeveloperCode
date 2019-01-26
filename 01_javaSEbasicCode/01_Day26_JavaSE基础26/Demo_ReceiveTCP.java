package com.test26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo_ReceiveTCP {
	/*
	 * 服务器
	 */
	public static void main(String[] args) throws IOException {
		//指定服务器端口,让客户端能匹配上
		ServerSocket serversocket=new ServerSocket(6660);
		//创建socket,用于接收服务器端的请求
		Socket socket=serversocket.accept();
		//创建与服务器端通信的输入输出流
		InputStream is=socket.getInputStream();
		OutputStream os=socket.getOutputStream();
		//向客户端写数据
		os.write("请问找我有什么事?".getBytes());
		//使用小数组的方式读取客户端传来的数据
		byte[] arr=new byte[1024*8];
		int len=is.read(arr);
		System.out.println(new String(arr, 0, len));
		//服务器一般不关闭
	}

}
