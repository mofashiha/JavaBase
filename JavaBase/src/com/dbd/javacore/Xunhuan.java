package com.dbd.javacore;

import java.util.Scanner;

public class Xunhuan {
	public static void forEachDemo(){
		String[] strs={"AA","BB","CC"};
	     for(String string:strs){
	    	 System.out.println("数组的元素为："+string);
	     }	
	}
	public static void whileDemo(int num){
		int j=0;
		while(j<num){
			System.out.println("+1s");
			j++;
		}
	}
	public static void doWhileDemo(int num){
		int i = 0;
	    do{
	    	System.out.println("+2s");
	    	i++;
	    }while(i<num) ;
	}
	public static void forDemo(int num){
		 for(int k=0;k<num;k++){
		    	System.out.println("+3s");
		    }
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num=input.nextInt();
		forEachDemo();
		whileDemo(num);
		doWhileDemo(num);
		forDemo(num);
	}
}
	
	
    

