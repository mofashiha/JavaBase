package com.dbd.javacore;

public class Xiaoheshang {

	public static void main(String[] args) {
	int water=15,i=0;
    while(water<50){
    	water+=5;
    	i++;
    }
    System.out.println("小和尚挑水的次数为："+i);
    do{ i=i-1;
    	water+=5;
    	i++;
    }while(water<50);
    System.out.println("小和尚挑水的次数为："+i);
	}
}
