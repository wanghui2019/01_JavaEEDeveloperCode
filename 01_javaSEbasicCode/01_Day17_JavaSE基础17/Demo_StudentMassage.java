package com.test17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.student.Student;

public class Demo_StudentMassage {
	/*
	 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按学生总分进行排名
	 * 1.创建键盘录入对象
	 * 2.依次录入5名学生信息学生信息,存储在TreeSet集合中
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				//按总分从高到低进行比较
				int num=o2.getSum()-o1.getSum();
				return num==0 ? 1 : num;
			}
		});
		while(ts.size()<5) {
			String str=sc.nextLine();
			String[] sarr=str.split(",");          //使用“,”分割
			int chgrate=Integer.parseInt(sarr[1]);
			int magrate=Integer.parseInt(sarr[2]);
			int engrate=Integer.parseInt(sarr[3]);
			ts.add(new Student(sarr[0],chgrate,magrate,engrate));
		}
			System.out.println(ts);
	}
}
