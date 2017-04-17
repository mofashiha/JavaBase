package com.xinan.Annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface HelloWorld {
	public String name() default "小强";

	public int age() default 28;
}
