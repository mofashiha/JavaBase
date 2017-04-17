package com.xinan.array;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		int[] array1=new int[]{8,4,2,1,23,344,12,255};
		int sum=0;
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+" ");
		}
		for(int i=0;i<array1.length;i++){
			sum+=array1[i];
		}
	   System.out.println("");
		System.out.println(sum);
		
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		  System.out.println("请输入一个数：");
		  int a=input.nextInt();
		  for(int i=0;i<array1.length;i++){
			  if(a==array1[i]){
				  System.out.println("这个数字在这个数组内！");
			  }
			  else { 
				  System.out.println("这个数字不在这个数组内！");
				  break;
				  }
		  }
	}

}
