package com.test18;

import java.util.HashMap;

import com.student.Student;

public class Demo_Nesting {
	/*
	 * HashMap的嵌套
	 * 年级里键是学生的HashMap对象,值是班级代号,一个年级
	 * 班级里键是学生信息,值是学生住址,两个班级
	 */
	public static void main(String[] args) {
		HashMap<Student, String> classone=new HashMap<>();  //创建一班对象
		classone.put(new Student("张三",23), "北京");        //添加学生属性
		classone.put(new Student("李四",24), "上海");
		classone.put(new Student("王五",25), "广东");
		classone.put(new Student("赵六",26), "深圳");
		
		HashMap<Student, String> classtwo=new HashMap<>();  //创建二班对象
		classtwo.put(new Student("马云",40), "杭州");        //添加学生属性
		classtwo.put(new Student("化腾",41), "深圳");
		classtwo.put(new Student("强东",42), "北京");
		classtwo.put(new Student("嘉诚",43), "香港");
		
		HashMap<HashMap<Student, String>, String> subject=new HashMap<>();   //创建年级对象
		subject.put(classone, "superclass");                 //添加班级属性
		subject.put(classtwo, "leaderclass");
		for (HashMap<Student, String> clazz : subject.keySet()) {    //遍历班级的键
			String subvalue=subject.get(clazz);              //根据班级的键得到班级的值
			for (Student stu : clazz.keySet()) {             //遍历学生的键
				String address=clazz.get(stu);               //根据学生的键得到学生的值
				String name=stu.getName();                   //得到学生姓名
				Integer age=stu.getAge();                    //得到学生年龄
				System.out.println("班级:"+subvalue+",地址:"+address+",姓名:"+name+",年龄"+age);
			}
		}
	}

}
