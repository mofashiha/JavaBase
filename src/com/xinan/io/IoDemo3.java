package com.xinan.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoDemo3 {

	public static void main(String[] args) {
		 try {
			FileReader fr=new FileReader("myInfo.txt");
		    FileWriter fw=new FileWriter("copymyInfo.txt");
		    int read=fr.read();
		    while(read!=-1){
		    	fw.write(read);
		    	read=fr.read();
		    }

			fr.close();
			fw.close();
			System.out.println("Copy Success!");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
