package com.xinan.array;

import java.util.Arrays;

public class Mid {

	public static void main(String[] args) {
		System.out.println("中间数是："+getmid());
		
	}
	public static  int getmid(){
		int[] array={1,3,5,6,7,8,9};
		int l=array.length;
		Arrays.sort(array);
		int k=array[(l-1)/2];
		return k;
	}

}
