package com.dbd.javacore.fenzhi;

import java.util.Scanner;

import com.xinan.Exception.WodeException;

public class Singel {

	public static void main(String[] args)throws Exception  {
		int num=-1;
		int k =-1;
		boolean isEx = false;

		do {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入2個正确的数值：");
			try {
				num = input.nextInt();
				k = input.nextInt();
				isEx =false;
				if(num<=0){
					
					throw new Exception("三角形的高只能是正整数");
				}
				 if(k<0){						
					throw new Exception("三角形超出边界！");
				}
			}
			catch (Exception e) {			
				isEx = true;
				System.out.println("输入错误请重新输入：");
				System.out.println(e.getMessage());
			}

		} while (isEx);
       print(num,k);
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
