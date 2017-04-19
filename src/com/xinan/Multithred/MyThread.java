package com.xinan.Multithred;

public class MyThread extends Thread {

	@Override
	public void run() {
		// "当前的线程的名称是：" + Thread.currentThread().getName()获取当前
		System.out.println();
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "--" + i);
		}

	}
}
