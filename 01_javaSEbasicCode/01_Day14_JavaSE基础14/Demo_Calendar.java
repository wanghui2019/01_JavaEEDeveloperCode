package com.test14;

import java.util.Calendar;

public class Demo_Calendar {
	/*
	 * 使用Calendar获取标准日期
	 */
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();       //父类引用指向子类对象
		long year=c.get(Calendar.YEAR);          //获取年
		long month=c.get(Calendar.MONTH)+1;      //获取月,由于默认从0开始,所以要+1
		long day=c.get(Calendar.DAY_OF_MONTH);   //获取月中的日
		String week=getWeek(c.get(Calendar.DAY_OF_WEEK));   //获取星期中的日,默认星期日是第一天,调用方法getWeek
		long hour=c.get(Calendar.HOUR);          //获取小时
		long minute=c.get(Calendar.MINUTE);      //获取分钟 
		long second=c.get(Calendar.SECOND);      //获取秒
		
		System.out.println(year+"年"+month+"月"+day+"日"+week+hour+":"+minute+":"+second);
	}
	public static String getWeek(int w) {        //把日期与所对应的数字错开一位
		String[] nowweek= {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六",};
		return nowweek[w];
	}
}
