package com.dbd.javacore.ood;

import com.dbd.javacore.helloworld.phonemessage;

public class TestPhone {

	public static void main(String[] args) {
		Phone phone=new Phone();
		phone.brand="三星";
		phone.type="anycall";
		phone.price=3500;
		phone.showPhone();
		Cell cell=new Cell();
		cell.brand="南孚";
		cell.type="聚能环";
		cell.showCell();

	}
		
	}


