package com.test26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo_SendTCP {
	/*
	 * 客户端
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建socket,指定要访问的ip地址+端口号
		Socket socket=new Socket("127.0.0.1", 6660); 
		//建立和服务器想通信的输入输出流
		InputStream is=socket.getInputStream();
		OutputStream os=socket.getOutputStream();
		//使用小数组的方式读取服务器传来的数据
		byte[] arr=new byte[1024*8];
		int len=is.read(arr);
		System.out.println(new String(arr, 0, len));
		//访问服务器
		os.write("西瓜为什么叫西瓜?".getBytes());
		//释放资源
		socket.close();
	}

}
