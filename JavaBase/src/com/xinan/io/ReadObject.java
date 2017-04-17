package com.xinan.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		
     try {
		FileInputStream fis=new FileInputStream("person.txt");
	    ObjectInput ois=new ObjectInputStream(fis);
	    Person person1=(Person)ois.readObject();
	    Person person2=(Person)ois.readObject();
	    System.out.println(person1);
	    System.out.println(person2);
	    ois.close();
	    
     
     }  catch (IOException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}