package com.dbd.javacore.zwq;

public class Test {

	public static void main(String[] args) {
		Administrator admin=new Administrator();
		admin.name="zwq";
		admin.passworld =12345;
		admin.show();
		
		Customer customer =new Customer();
		customer.customer ="svip";
		customer.score=100;
		customer.show();

	}

}
