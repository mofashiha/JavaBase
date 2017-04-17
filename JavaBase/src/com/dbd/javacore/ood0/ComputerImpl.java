/**
 * 
 */
package com.dbd.javacore.ood0;

/**
 * @author Administrator
 *
 */
public class ComputerImpl implements Cpu, HardDisk, Ems {

	

	/* (non-Javadoc)
	 * @see com.dbd.javacore.ood.Cpu#brand()
	 */
	@Override
	public void brand() {
		System.out.println("品牌是：英特尔");

	}

	/* (non-Javadoc)
	 * @see com.dbd.javacore.ood.Cpu#hz()
	 */
	@Override
	public void hz() {
		System.out.println("主频是：3.0hz");

	}

	@Override
	public void Emssize() {
		System.out.println("内存是：8gb");
		
	}

	@Override
	public void HDsize() {
		System.out.println("硬盘是：1t");
		
	}

}
