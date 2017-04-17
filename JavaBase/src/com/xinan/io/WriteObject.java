package com.xinan.io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class WriteObject {

	public static void main(String[] args) {
	try {
		FileOutputStream fos=new FileOutputStream("person.txt");
	    ObjectOutputStream oos=new ObjectOutputStream(fos);
	   oos.writeObject(new Person(1,"jack","1234"));
	   oos.writeObject(new Person(2,"Rose", "5678"));
	   oos.close();
	   System.out.println("Success!");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
