package com.xinan.ood;

public class LockDoor extends Door implements Lock {

	public void close1() {
		System.out.println("插入钥匙打开锁");

	}

	@Override
	public void open1() {
		System.out.println("插入钥匙关闭锁");

	}

	@Override
	void open() {
		System.out.println("打开门");
		
	}

	@Override
	void close() {
		System.out.println("关上门");
		
	}

}
