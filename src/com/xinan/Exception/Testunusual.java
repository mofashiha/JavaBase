package com.xinan.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Testunusual {
	public static void main(String[] args) {
//		Testunusual div=new Testunusual();
//		int c =div.div();             
//		System.out.println(c);
		int c =div();         //通过abstrcat修饰方法，所以不用new一个对象出来在本类中直接就能调用方法
		System.out.println(c);
	}

	public static int div() {
		System.out.println("请输入两个要除的数：");
		Scanner input = new Scanner(System.in);
		try {
			int number1 = input.nextInt();
			int number2 = input.nextInt();
			System.out.println("两个数相除为：" + number1 / number2);
			return 0;
		} catch (InputMismatchException notnumber) {
			System.out.println("出错啦！输入的不是数字！");
			return 1;
		} catch (ArithmeticException iszero) {

			System.out.println("出错啦！被除的数不能为0");
			return 2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("出错啦！");
			return 3;
		} finally {
			System.out.println("程序结束");

		}

	}

}
