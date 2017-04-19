package com.dbd.javacore.ood;

import java.util.Scanner;

public class Zhazhi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入水果：");
		String fruit=input.nextLine();
		Zhazhiji myZhazhi=new Zhazhiji();
		String myjuice=myZhazhi.zhazhi(fruit);
		System.out.println(myjuice);

		
		
	}

}
