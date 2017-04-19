package com.xinan.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.dbd.javacore.fangfadiaoyong.Person;

public class ReflectDemo2 {

	private static final String SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws Exception {
		/*demo();
		demo1();*/
		demo2();
	}

	private static void demo2() {


	}

	public static void demo1() throws NoSuchFieldException, InstantiationException, IllegalAccessException {
		Class<?> person = Person.class;
		// 获取age属性
		Field ageF = person.getDeclaredField("age");
		// 实例化这个类赋给o
		Object o = person.newInstance();
		// 打破封装
		ageF.setAccessible(true); // 使用反射机制可以打破封装性，导致了java对象的属性不安全。
		// 给o对象的age属性赋值"25"
		ageF.set(o, 25);
		// get
		System.out.println(ageF.get(o));
	}

	private static void demo() throws Exception {
		Class<?> person = Person.class;
		Field[] fs = person.getDeclaredFields();
		 StringBuffer sb=new StringBuffer();
		 sb.append(Modifier.toString(person.getModifiers())+" class "+person.getSimpleName()+"{"+SEPARATOR);
		 for (Field field : fs) {
		 sb.append("\t");
		 sb.append(Modifier.toString(field.getModifiers())+" ");
		 sb.append(field.getType().getSimpleName()+" ");
		 sb.append(field.getName()+";"+SEPARATOR);
		 }
		 sb.append("}");
		 System.out.println(sb);
		 
	}

}
