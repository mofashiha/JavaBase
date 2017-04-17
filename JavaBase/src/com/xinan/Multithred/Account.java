package com.xinan.Multithred;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Account {

	private boolean hasmoney=false;
	private int money=0;
	
	public Account(int money){
		this.money=money;
	}
	public synchronized void draw() {
		
		
		if(hasmoney){
			System.out.println("开始取钱");
		   setMoney(getMoney()-money);
			
		}
	}
	
	
	
}
