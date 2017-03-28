package com.xinan.ood;

public class TestLockDoor {

	public static void main(String[] args) {
		Lock lock=new LockDoor();
		Door door=new LockDoor();
		door.open();
		lock.open1();
		lock.close1();
		door.close();

	}

}
