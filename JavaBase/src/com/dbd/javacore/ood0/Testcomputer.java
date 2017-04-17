package com.dbd.javacore.ood0;

import lombok.Getter;

public class Testcomputer {

	public static void main(String[] args) {
		Cpu cpu=new ComputerImpl();
		Ems ems=new ComputerImpl();
		HardDisk hd=new ComputerImpl();
		cpu.brand();
		cpu.hz();
		ems.Emssize();
		hd.HDsize();

	}

}
