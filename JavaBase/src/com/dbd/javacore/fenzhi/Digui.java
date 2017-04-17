package com.dbd.javacore.fenzhi;

public class Digui {
  int i=0;
  int sum=0;
	public static void main(String[] args) {
Digui digui=new Digui();

	 digui.addsum()	;
	}

	public void addsum(){
		if(i<=100){	
			sum+=i;
			i++;
			addsum();
		}else
		System.out.println(sum);		
	}
}
