package com.dbd.javacore.fenzhi;

import java.util.Scanner;

public class Edsad {
	public static void main(String[] args)throws Exception
	{
		int index = 1;
		int R = 0;
		int l = 0;
		boolean isEx = false;
		while (index == 1) {
		do{
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("请输入三角形的高度：");
			l = input.nextInt();		  
			System.out.println("请输入要水平移动的距离(正数代表向左负数代表向右)：");
			R = input.nextInt();
			if(l<=0){
				System.out.println();
				isEx=true;
				throw new Exception("三角形的高只能是正整数");
			}
			else if(R<0){
				System.out.println("三角形超出边界！");
				isEx=true;
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("输入有误请重新输入！");
		        isEx=true;
		}
		}while(isEx);
	
			Scanner input1 = new Scanner(System.in);
			print(l, R);
			System.out.println("退出请按0！继续请按1！");
			index = input1.nextInt();

		}
	}

	private static void print(int l, int R) {
		for (int i = 1; i <= l; i++) {
			for (int j = 1; j <= R + 2 * l - 1; j++) {
				if (i == l) {
					if (j <= R) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (j == R + l + 1 - i || j == R + l - 1 + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	}

