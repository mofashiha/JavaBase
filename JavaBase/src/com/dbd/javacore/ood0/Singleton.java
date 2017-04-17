package com.dbd.javacore.ood0;

public class Singleton {
	private static Singleton instance=new Singleton();
	
	private Singleton(){
	
		System.out.println("饿汉式单例模式测试！");
		
	}
	public static Singleton getinstance() {
		return instance;
		
	}
	
}
