package com.xinan.Multithred;

public class TestCunQuMoney {

	public static void main(String[] args) {
		Account account=new Account(0);
		Thread qt=new Thread(new QuqianThread(500));
		Thread ct=new Thread(new CunqianThred(500));
		qt.start();
		ct.start();
		

	}

}
