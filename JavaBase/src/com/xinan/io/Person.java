
package com.xinan.io;

import java.io.Serializable;


public class Person implements Serializable {
    private static final long serialVersionUID=1L;
	private int personId;
	private String name;
	private String pass;
	public Person(){
		
	}
	public Person(int personId,String name,String pass){
		this.personId=personId;
		this.name=name;
		this.pass=pass;
			
	}
	@Override
	public String toString() {
		return "personId:" + personId + "\tname:" + name + "\tpass:" + pass;
	}
	

	}


