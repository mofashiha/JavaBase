package com.xinan.Multithred;

public class Test {

	public static void main(String[] args) {
		Thread myThread1 = new MyThread();
		myThread1.setName("MyThread");
		myThread1.start();//线程不是立即执行，而是就绪状态执行时调用run()

		//Runnable myrunnable = new MyRunable();
		//Thread mythread2 = new Thread(myrunnable);
	  Thread myRunnable=new Thread(new MyRunable());
	  myRunnable.setName("MyRunnable");
	  myRunnable.start();

	}

}
