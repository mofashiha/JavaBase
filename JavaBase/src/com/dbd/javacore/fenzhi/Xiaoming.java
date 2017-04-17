package com.dbd.javacore.fenzhi;

import java.util.Scanner;

public class Xiaoming {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("请输入小明的成绩");
	int score=input.nextInt();
	if(score==100){
		System.out.println("爸爸给他买辆车");
	}
	else if(score>=90){
		System.out.println("妈妈给她买MP4");
	}
	else if((score<90)&&(score>=60)){
		System.out.println("妈妈给她买本参考书");
	}
	else if(score<60){
		System.out.println("啥都没");
	}
	

	}

}
