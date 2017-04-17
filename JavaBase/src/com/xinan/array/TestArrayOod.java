package com.xinan.array;

import static java.lang.System.out;


import java.util.Arrays;

public class TestArrayOod {

	public static void main(String[] args) {
		Student[] students=new Student[3];
		students[0] = new Student("zhangsan", 20);
		students[1] = new Student("lisi", 19);
		students[2] = new Student("wangwu", 22);
		out.println("students 原始值：");
		for(Student student:students){
			out.println(student);	
		}
		out.println("students 按照年龄排序后：");
		Arrays.sort(students);
		for(Student student:students){
			out.println(student);	
	}

	}
	}
