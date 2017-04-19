package com.xinan.Annotation;

import java.lang.reflect.Field;

public class Test1Demo {

	public static void main(String[] args) throws Exception {

		Class<?> clazz = Class.forName("com.xinan.Annotation.Person2");
		Object o = clazz.newInstance();
		System.out.println("修改属性前：" + o);
		Field[] fs = clazz.getDeclaredFields();
		for (Field field : fs) {
			if (field.isAnnotationPresent(Myannotation.class)) {
				Myannotation annotation = field.getAnnotation(Myannotation.class);
				field.setAccessible(true);
				switch (field.getType().getSimpleName().toString()) {
				case "int":
					field.set(o, Integer.valueOf(annotation.age()));
					break;
				case "double":
					field.set(o, Double.valueOf(annotation.score()));
					break;
				case "String":
					field.set(o, annotation.name());
				default:
					break;
				}
			}

		}
		System.out.println("修改属性后：" + o);

	}

	

}
