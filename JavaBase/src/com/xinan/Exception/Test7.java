package com.xinan.Exception;

import java.util.Scanner;

public class Test7 {
	// public static void main(String[] args) throws Exception {
	// 调用者去继续声明异常
	// 在main方法中声明的各种异常由java虚拟机去解决异常
	// int c =div();
	// System.out.println(c);
	// }
	public static void main(String[] args) {
		// 调用者处理异常
		// int c = -1;
		// try {
		// c = div();
		// } catch (Exception e) {
		// System.out.println("出现错误");
		// e.printStackTrace();
		// }
		// System.out.println(c);
//		try {
//			System.out.println(div(-5) + "岁");
//		} catch (WodeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			System.out.println(div());
		} catch (Exception e) {
			System.out.println("");
			e.printStackTrace();
		}

	}

	public static int div() throws WodeException {
		System.out.println("请输入两个要除的数：");
		 Scanner input = new Scanner(System.in);
		 int number1 = input.nextInt();
		 int number2 = input.nextInt();	
		 if (number2==0) {
				throw new WodeException();//重写自定义异常的构造方法，可以往（）里传参
		} //自定义异常类默认里面有一个无参构造方法
			 System.out.print("两个数相除为：");
			return number1 / number2;
		
		// // 声明异常，多个异常用逗号隔开
		// System.out.println("请输入两个要除的数：");
		// Scanner input = new Scanner(System.in);
		// int number1 = input.nextInt();
		// int number2 = input.nextInt();
		// System.out.println("两个数相除为：" + number1 / number2);
		// return 0;
//		if (age < 0) {
//			throw new WodeExpetion("age 不能小于0");
//		} else
//			return age;
	}
}
