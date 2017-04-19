/**
 * 
 */
package com.dbd.javacore.ood0;

/**
 * @author Administrator
 *
 */
public class LockDoorImpl implements Door, Lock {

	@Override
	public void open1() {
		System.out.println("插上钥匙，向左旋转三圈门锁住了！");

	}

	@Override
	public void close1() {	
		System.out.println("插上钥匙，向左右旋转三圈门打开了！");
	}

	@Override
	public void open() {
		System.out.println("轻轻推门，门打开了！");
	}

	@Override
	public void close() {
		System.out.println("轻轻拉门，门关上了！");
	}

}
