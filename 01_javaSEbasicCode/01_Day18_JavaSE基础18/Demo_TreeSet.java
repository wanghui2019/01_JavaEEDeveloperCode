package com.test18;

import java.util.Comparator;
import java.util.TreeMap;

import com.student.Student;

public class Demo_TreeSet {
	/*
	 * 键为Student,值为String类型的TreeMap排序
	 */
	public static void main(String[] args) {
		TreeMap<Student, String> map=new TreeMap(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int num=o1.getName().compareTo(o2.getName());
				return num==0 ? o1.getAge()-o2.getAge() : num;
			}
		});
		map.put(new Student("张三",23), "北京");
		map.put(new Student("赵六",17), "深圳");
		map.put(new Student("李四",17), "上海");
		map.put(new Student("王五",30), "广东");
		System.out.println(map);
	}

}
