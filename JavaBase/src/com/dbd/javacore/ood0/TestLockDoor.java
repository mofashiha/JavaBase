package com.dbd.javacore.ood0;

public class TestLockDoor {

	public static void main(String[] args) {
		Door door=new LockDoorImpl();
		Lock lock=new LockDoorImpl();
		door.open();
		lock.open1();
		lock.close1();
		door.close();

	}

}
