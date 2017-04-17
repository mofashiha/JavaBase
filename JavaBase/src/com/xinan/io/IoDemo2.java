package com.xinan.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo2 {

	public static void main(String[] args) {
		
			try {
				FileInputStream fr=new FileInputStream("E:\\视频\\99IO2_2017-04-06_143952.wmv");
				FileOutputStream pw=new FileOutputStream("copy.wmv");
				int read =fr.read();//从fr读一个字节
				while(read!=-1){
					pw.write(read);
					read=fr.read();
				}
				
				fr.close();
				pw.close();
			
				System.out.println("Copy Success!");
			} catch (FileNotFoundException e) {			
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		
	}

}
