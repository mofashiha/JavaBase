package com.xinan.array;

import java.util.Arrays;
import java.util.Scanner;

public class Pailie {

	public static void main(String[] args) {
		int[] scores = new int[5];	//成绩数组
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
		}

		Arrays.sort(scores);			
		System.out.println("学员成绩按升序排列：");
		for(int i = 0; i < scores.length; i++){
			System.out.print(scores[i] + " ");
		}
		System.out.println("");
		System.out.println("学员成绩按降序排列：");
		for(int i=scores.length;i>0;i--){
			System.out.print(scores[i-1] + " ");
		}
		
	}

}
