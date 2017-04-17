package com.xinan.Multithred;

public class MyRunable implements Runnable {

	@Override
	public void run() {
		System.out.println("当前的线程的名称是：" + Thread.currentThread().getName());
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "--" + i);
		}

	}

}
