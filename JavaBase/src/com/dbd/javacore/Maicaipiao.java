package com.dbd.javacore;

import java.util.Scanner;

public class Maicaipiao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入中没中，中了扣1没中扣2：");
		int result = input.nextInt();
		if (result == 1) {
			System.out.println("我买车、资助希望工程、去欧洲旅游");
		} 
		else {

			System.out.println("我买下一期体彩，继续烧高香");
		}

	}

}
