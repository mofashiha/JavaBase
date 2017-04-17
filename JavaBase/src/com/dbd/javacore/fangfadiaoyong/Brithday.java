package com.dbd.javacore.fangfadiaoyong;

public class Brithday {
	private int year;
	private int month;
	private int day;

	public void display(int year, int month, int day) {// 值传递，参数为基本类型
		year = 1996;
		month = 7;
		day = 10;
		System.out.println("传递中：" + year + "-" + month + "-" + day);
	}

	public void display(Brithday brithday) {// 引用传递，传递的是引用类型
		brithday.year = 2017;
		brithday.month = 3;
		brithday.day = 21;
		System.out.println("传递中：" + brithday.year + "-" + brithday.month + "-" + brithday.day);
	}

	     /* 值 传递测试 */
	public static void TestValue1() {
		Brithday brithday = new Brithday();
		// 定义三个基本类型的变量（8种基本类型数据，其他全部是引用类型）
		int year = 2008;
		int month = 8;
		int day = 1;
		System.out.println("传递前：" + year + "-" + month + "-" + day);
		// 传递三个基本类型的变量到display方法中，并在方法中改变这三个变量的值
		brithday.display(year, month, day);
		System.out.println("传递后：" + year + "-" + month + "-" + day);
	}

	      // 引用 传递测试
	public static void TestValue2() {
		// 创建brithday对象
		Brithday brithday = new Brithday();
		brithday.year = 2008;
		brithday.month = 8;
		brithday.day = 1;
		System.out.println("传递前：" + brithday.year + "-" + brithday.month + "-" + brithday.day);
		// 将birthday对象传递到display方法中，并在方法中改变改变brithday对象的值
		brithday.display(brithday);
		System.out.println("传递后：" + brithday.year + "-" + brithday.month + "-" + brithday.day);
	}

	public static void main(String[] args) {
		// 调用测试1，2
		TestValue1();
		System.out.println("-------------");
		TestValue2();
	}
}
