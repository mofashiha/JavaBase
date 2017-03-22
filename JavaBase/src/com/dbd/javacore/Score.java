package com.dbd.javacore;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入姓名");
		String name = input.next();
	     int sumScore=0;
		for (int i = 1; i <= 5; i++) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("请输入第" + i + "门成绩：");
			int score = input1.nextInt();
		     sumScore+=score;
		}
	     double averageScore=sumScore/5;
	     System.out.println("平均成绩是："+averageScore);

	}

}
