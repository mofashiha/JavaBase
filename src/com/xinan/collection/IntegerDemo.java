package com.xinan.collection;

public class IntegerDemo {

	public static void main(String[] args) {
		Integer integer1=127;
		Integer integer2=127;
        System.out.println(integer1==integer2);
        System.out.println(integer1.equals(integer2));
        System.out.println("................");
        Integer integer3=128;
		Integer integer4=128;
		System.out.println(integer3==integer4);//超过了范围   127
        System.out.println(integer3.equals(integer4));
        System.out.println("................");
        Integer integer5=new Integer(125);
      	Integer integer6=new Integer(125);//new 出来的应用类型变量
      	System.out.println(integer3==integer4);//地址不一样，栈空间
        System.out.println(integer3.equals(integer4));//属性一样，堆空间
	}

}
