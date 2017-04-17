package com.xinan.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		System.out.println("请输入十个数字：");

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array1.length; i++) {
		
			array1[i] = input.nextInt();
		}
		int sum = 0;
		int Max = array1[0];
		int Min = array1[0];
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] < Min) {
				Min = array1[i];
			}
			if (array1[i] > Max) {
				Max = array1[i];
			}
			sum += array1[i];
		}
		System.out.println("最大值是： " + Max);
		System.out.println("最小值是： " + Min);
		double avg = 0.0;
		avg = (double) sum / 10;
		System.out.println("总和是： " + sum);
		System.out.println("平均数是： " + avg);

		System.out.println("这十个数升序排列是：");
		Arrays.sort(array1);

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("");
		System.out.println("这十个数降序排列是：");
		for (int i = array1.length - 1; i>=0; i--) {
			System.out.print(array1[i] + " ");
		}
	}

}
