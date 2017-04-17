package com.xinan.Annotation;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.xinan.Annotation.Person");
		Method method = clazz.getMethod("get", String.class, int.class);
		Object object = clazz.newInstance();
		method.invoke(object, "旺财", 18);

	}

}
