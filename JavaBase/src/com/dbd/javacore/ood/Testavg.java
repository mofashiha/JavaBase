package com.dbd.javacore.zwq;

import java.util.Scanner;

public class Testavg {

	public static void main(String[] args) {
	 Avg avg=new Avg();
	 Scanner input1=new Scanner(System.in);
	 System.out.println("请输入java成绩：");
	 avg.java=input1.nextInt();
	 Scanner input2=new Scanner(System.in);
	 System.out.println("请输入c#成绩：");
	 avg.c=input2.nextInt();
	 Scanner input3=new Scanner(System.in);
	 System.out.println("请输入DB成绩：");
	 avg.DB=input3.nextInt();
	 avg.showAvg();

	}

}
