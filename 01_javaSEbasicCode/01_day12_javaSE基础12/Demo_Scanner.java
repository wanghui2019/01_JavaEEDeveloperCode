package com.scanner;

public class Demo_Scanner {

	public static void main(String[] args) {
		
		byte[] arr0= {'a','b','c','d','e'};
		String s0=new String(arr0);        //String(byte[] bytes)
		System.out.println(s0);
		String s1=new String(arr0, 1, 3);  //String(byte[] bytes, int offset, int length)
		System.out.println(s1);
		char[] arr1= {97,98,99,100,101};
		String s2=new String(arr1);        //String(char[] value)
		System.out.println(s2);
		String s3=new String(arr1, 1, 3);  //String(char[] value, int offset, int count)
		System.out.println(s3);
		String s4=new String("helloworld");   //只是创建一个副本出来
		System.out.println(s4);
		/*
		 * String的判断功能
		 */
		System.out.println();
		System.out.println();
		String judge1="abc";
		String judge2="ab"+"c";
		System.out.println("equals:"+judge1.equals(judge2));     //比较字符串的内容是否相同,区分大小写
		String judge3="ABC";
		System.out.println("equalsIgnoreCase:"+judge1.equalsIgnoreCase(judge3));   //忽略大小写
		
		String judge4="a";
		System.out.println("Contains:"+judge1.contains(judge4));       //判断打字符是否包含小字符
		
		System.out.println("startWith:"+judge1.startsWith("a"));       //判断是否以某个字符开头
		
		System.out.println("endWith:"+judge1.endsWith("c"));          //判断是否以某个字符结尾
		
		System.out.println("isEmpty:"+judge1.isEmpty());               //判断是否为空
		/*
		 * String的获取功能
		 */
		System.out.println();
		System.out.println();
		String getfeatures="abcdefbcdb";
		System.out.println(getfeatures.length());                //获取字符串的长度
		
		System.out.println(getfeatures.charAt(1));               //获取指定索引位置的字符

		System.out.println(getfeatures.indexOf("bc"));           //返回指定字符串/字符第一次出现的位置
		
		System.out.println(getfeatures.indexOf("bc", 3));       //从指定的索引开始,之后第一次遇到的指定字符串/字符位置
		
		System.out.println(getfeatures.lastIndexOf("bc"));      //指定字符串/字符最后一次出现的位置
		
		System.out.println(getfeatures.substring(2));           //从指定某个位置开始,返回一个子字符串,默认到结尾,左闭
		
		System.out.println(getfeatures.substring(2, 7));      //从指定某个位置开始,返回一个子字符串,默认到指定位置,左闭右开
		/*
		 * String的转换
		 */
		System.out.println();
		System.out.println();
		String change1="abcdef";
		byte[] changearr1=change1.getBytes();             //将字符串转换为字节数组
		for (int i = 0; i < changearr1.length; i++) {
			System.out.println(changearr1[i]);
		}
		/*
		 * String change4=String.valueOf(changearr1);  
		 * System.out.println(change4.toString());
		 */
		System.out.println();
		char[] changearr2=change1.toCharArray();          //将字符串转换为字符数组
		for (int i = 0; i < changearr2.length; i++) {
			System.out.println(changearr2[i]);
		}
		System.out.println();
		String change3=String.valueOf(changearr2);      //将字符数字转换为字符串
		System.out.println(change3);
		System.out.println();
		int change5=100;
		System.out.println(String.valueOf(change5));    //将整型转换为字符数组
		/*
		 * String的其它功能
		 */
		System.out.println();
		System.out.println();
		String other1="affgfhdfgfjk";
		String other2="abc";
		String otherstring1=other1.replace("f", "a");       //将所有的字符f都用a代替
		String otherstring3=other1.replace("fg", "ab");     //替换字符串
		System.out.println(otherstring1);
		System.out.println(otherstring3);
		String otherstring2=other1.replaceAll(other1, other2);   //将字符串全部替换
		System.out.println(otherstring2);
		System.out.println();
		String trim="  asf   ffg   ";
		String trim1=trim.trim();           //去除收不和尾部空格
		System.out.println(trim1);
		System.out.println();
		String compare1="ba";
		String compare2="bb";
		int num=compare1.compareTo(compare2);    //按字典排序进行比较
		System.out.println(num);
		
	}
}
