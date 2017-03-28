package com.dbd.javacore.helloworld;

import java.util.Scanner;

public class Aobama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 System.out.println("请输入奥巴马的成绩:");
	 int score = input.nextInt();
	
	 if (score==100){
		System.out.println("奖励一辆车");
	 }else if(score>=90){
		 System.out.println("奖励一台电脑"); 
	 }else if(score>=60){
		 System.out.println("奖励一部手机"); 
	 }else if(score<=60){
		 System.out.println("没有礼物"); 
	 }else if(score<=30){
		 System.out.println("奖励30大板"); 
	 }
		 
	 

}

}
