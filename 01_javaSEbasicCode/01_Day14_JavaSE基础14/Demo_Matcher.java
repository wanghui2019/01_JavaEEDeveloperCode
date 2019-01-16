package com.test14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo_Matcher {
	/*
	 * 从一串乱文中查找指定邮箱
	 */
	public static void main(String[] args) {
		String s="ajgjagjjkh1312833457@qq.comajgjklgjhj@djajggjgjj1382647586@qq.comfjkjg";
		Pattern p=Pattern.compile("13\\d{8}@qq.com");    //获取到正则表达式
		Matcher m=p.matcher(s);                          //获取匹配器,拿正则去匹配字符串s
		while(m.find()) {                                //匹配到了,find内有指针,会自动后移
			System.out.println(m.group());               //打印输出
		}
	}

}
