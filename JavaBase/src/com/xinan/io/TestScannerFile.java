package com.xinan.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScannerFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("myInfo.txt");
        Scanner in=new Scanner(file);
        String info=null;
        while(in.hasNextLine()){
        	info=in.nextLine();  
        	System.out.println(info);
        }
	}

}
