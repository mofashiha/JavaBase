package com.dbd.javacore.fenzhi;

import java.util.Scanner;

public class Aobazhu {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 System.out.println("请输入奥巴马的成绩:");
	 int score = input.nextInt();
	 switch(score){
	 case 100: System.out.println("奖励一部车");
	 break;
	 case 90: System.out.println("奖励一台电脑");
	 break;
	 case 60: System.out.println("奖励一部手机");
	 break;
	 case 50: System.out.println("没奖励");
	 break;
	 case 20: System.out.println("一顿毒打");
	 break;
	 
	 }
	}

}
