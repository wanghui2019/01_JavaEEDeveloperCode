package com.test26;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo_QQ {
	/*
	 * 一个qq聊天小程序
	 * 需求:发送功能,记录功能,清屏功能,震动功能
	 */
	public static void main(String[] args) throws IOException {
		//创建窗体
		new MyFrame("QQ");
	}
}
class MyFrame extends Frame{
	private Button send;
	private Button flag;
	private Button clear;
	private Button shake;
	private TextField ip;
	private TextArea sendarea;
	private TextArea showarea;

	//空参构造函数,初始化数据
	public MyFrame(String title) throws IOException {
		//大的边框
		Init();
		//南边的Panel
		southPanel();
		//中间的panel
		enterPanel();
		//设置行为动作
		Action();
		//显示
		this.setVisible(true);
	}
	//设置行为动作
	public void Action() throws IOException {
		//窗体监听退出
		windowsListen();
		//鼠标监听发送接收功能
		mouseListen();
		
		
	}
	//鼠标监听发送接收功能
	public void mouseListen() {
		send.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					sendAction();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

					/*
					//接收功能
						new Thread() {
							public void run() {
								try {
									receiveAction();
								} catch (IOException e) {
									e.printStackTrace();
								} 
							}
						}.start();
						try {
							Thread.sleep(100);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						*/
						//发送功能
			}
			/*
			 * 接收功能
			 */
			/*public void receiveAction() throws IOException {
				DatagramSocket receivesocket=new DatagramSocket(6666);  //指定端口号接收
				byte[] receivearr=new byte[1024];                       //创建要接收的字节数组
				//将接收到的内容打包
				DatagramPacket receivepacket=new DatagramPacket(receivearr, receivearr.length);
				receivesocket.receive(receivepacket);                   //接收
				receivesocket.close();                                  //释放资源
				//处理接收到的数据
				byte[] receive=receivepacket.getData();                  //将接收到的打包内容转换为字节数组
				int len=receivepacket.getLength();                       //接收到的字节数组的长度
				String receivestr=new String(receive, 0, len);           //创建一个包含接收到内容的字符串对象
				showarea.setText(receivestr);                            //在显示文本框里显示
			}*/
			/*发送功能	
			 * 假如自己发送给自己,客户端是发送区,服务器是显示区
			 */
			public void sendAction() throws IOException {
				DatagramSocket sendsocket=new DatagramSocket();       //随机端口号发送
				String sendstr=sendarea.getText();                    //获取发送端文本信息
				byte[] sendarr=sendstr.getBytes();
				//打包
				DatagramPacket sendpacket=
						new DatagramPacket(sendarr, sendarr.length, InetAddress.getByName("127.0.0.1"), 6666);
				sendsocket.send(sendpacket);                          //发送
				sendsocket.close();                                   //释放资源
				
				showarea.append(sendstr);                             //显示内容
				showarea.append("\r\n");                              //换行
				sendarea.setText("");                                 //将发送区域设为空
			}		
		});	
	}
	
	//窗体监听退出
	public void windowsListen() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		});
	}
	
	//中间的panel
	public void enterPanel() {
		Panel center=new Panel();                  //设置一个中间的Panel
		sendarea = new TextArea(8,1);              //设置发送区域
		showarea = new TextArea();                 //设置显示区域
		showarea.setEditable(false);               //设置为不可以编译
		sendarea.setBackground(Color.white);       //设置发送文本区域为白色
		sendarea.setFont(new Font("random", Font.BOLD, 20));
		showarea.setFont(new Font("random", Font.BOLD, 20));
		center.add(sendarea);                      //将发送的文本区域添加到中间的Panel里
		center.add(showarea);                      //将显示的文本区域添加到中间的Panel里
		center.setLayout(new BorderLayout());      //设置为边界布局
		center.add(sendarea, BorderLayout.SOUTH);  //将发送文本区域放到中间Panel的南边
		center.add(showarea, BorderLayout.CENTER); //将显示文本区域放到中间Panel的中间
		this.add(center, BorderLayout.CENTER);     //将Panel添加到Frame里
	}
	
	//南边的Panel
	public void southPanel() {
		Panel south=new Panel();                   //南边的面板
		ip = new TextField("",18);                 //设置ip文档字段
		send=new Button("发送");                   //发送按钮
		flag=new Button("记录");                   //记录按钮
		clear=new Button("清屏");                  //清屏按钮
		shake=new Button("震动");                  //震动按钮
		south.add(ip);                             //添加ip文本字段添加到南边的面板
		south.add(send);                           //添加发送按钮添加到南边的面板
		south.add(flag);                           //添加记录按钮添加到南边的面板
		south.add(clear);                          //添加清屏添加到南边的面板
		south.add(shake);                          //添加震动添加到南边的面板
		this.add(south, BorderLayout.SOUTH);       //将南边的Panel添加到MyFrame的南边
	}
	
	//大的边框
	public void Init() {
		this.setLocation(700, 100);                 //设置Frame位置
		this.setSize(500, 800);                     //设置Frame大小
		this.setLayout(new BorderLayout());	        //将Frame设置为边界布局
	}
}