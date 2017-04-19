package com.xinan.Annotation;

public class Person2 {
	@Myannotation
	private int age = 20;
	@Myannotation
	private String name = "旺财";
	@Myannotation
	private double score = 95.9;
    
	@Override
	public String toString() {
		return "Person2 [age=" + age + ", name=" + name + ", score=" + score + "]";
	}

	public Person2() {
		
	}

	
	
}
