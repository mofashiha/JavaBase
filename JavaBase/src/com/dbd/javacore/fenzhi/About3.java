package com.dbd.javacore.fenzhi;

public class About3 {

	public static void main(String[] args) {
		int sum=0;
	for(int i =0;i<100;i++){
		if(i%3!=0){
			sum+=i;
		}
	}
	System.out.println("不能被三整除的数之和为："+sum);
	

	}

}
