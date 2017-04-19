package com.xinan.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestStandartStreamResert {

	public static void main(String[] args) throws FileNotFoundException {
	System.setIn(new FileInputStream("myInfo.txt"));
	System.setOut(new PrintStream("2myInfo.txt"));
	Scanner in=new Scanner(System.in);
	String message=null;
	do{
		message=in.next();
		System.out.println(message);
	}while(in.hasNextLine());
	in.close();
	System.out.println("Copy Success");

	}

}
