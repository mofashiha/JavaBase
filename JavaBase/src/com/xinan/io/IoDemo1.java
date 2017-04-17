package com.xinan.io;

import java.io.File;
import java.util.Date;

public class IoDemo1 {

	public static void main(String[] args) {
		File f1=new File("aa.txt");
		File f2=new File("D:/temp/");
		System.out.println("name:"+f1.getName());
		System.out.println("path:"+f1.getPath());
		System.out.println("Absolutepath:"+f1.getAbsolutePath());
		System.out.println("parent:"+f1.getParent());
		System.out.println("lastModifiled"+new Date(f1.lastModified()));
		System.out.println("length:"+f1.length());
		System.out.println("exists:"+f1.exists());
		System.out.println("canRead:"+f1.canRead());
		System.out.println("canWrite:"+f1.canWrite());
		System.out.println("isFile:"+f1.isFile());
		System.out.println("isHidden"+f1.isHidden());
		System.out.println("isDirectory:"+f1.isDirectory());
		System.out.println("isAbsolute"+f1.isAbsolute());
		f1.delete();
	}

}
