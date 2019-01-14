package com.character;

public class Demo_CountCharacter {
	/*
	 * 给出一串字符,分别统计该字符的大写字母,小写字母,数字以及特殊符号的个数
	 * 例如:ASaadfg12543HJaaa67@#jbbhvc%¥JK
	 */
	public static void main(String[] args) {
		/*
		 * 分析:在ASCII码表中有对字符种类的分类,因此可以借助ASCII码表
		 * 48~57:数字
		 * 65~90:大写字母
		 * 97~122:小写字母
		 * 剩下的都是特殊符号
		 */
		 String confusionstring="ASaadfg12543HJaaa67@#jbbhvc%¥JK";
		 int num=0;
		 int bigletter=0;
		 int smallletter=0;
		 int other=0;
		 StringBuffer endnumber=null;
		 StringBuffer endbig=null;
		 StringBuffer endsmall=null;
		 StringBuffer endother=null;
		 for(int i=0;i<confusionstring.length();i++) {
			 char value=confusionstring.charAt(i);
			 if (value>=48&&value<=57) {
				StringBuffer numbuffer=new StringBuffer();
				endnumber=numbuffer.append(value);
				num++;
			}else if(value>=65&&value<=90) {
				StringBuffer bigbuffer=new StringBuffer();
				endbig=bigbuffer.append(value);
				bigletter++;
			}else if(value>=97&&value<=122) {
				StringBuffer smallbuffer=new StringBuffer();
				endsmall=smallbuffer.append(value);
				smallletter++;
			}else {
				StringBuffer otherbuffer=new StringBuffer();
				endother=otherbuffer.append(value);
				other++;
			}
		 }
		    System.out.println("number:"+endnumber.toString()+num);
			System.out.println("bigletter:"+endbig.toString()+bigletter);
			System.out.println("smallletter:"+endsmall.toString()+smallletter);
			System.out.println("other:"+endother.toString()+other);
	}
}
