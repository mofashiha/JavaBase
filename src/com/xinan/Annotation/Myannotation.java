package com.xinan.Annotation;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target( FIELD)
public @interface Myannotation {
	int age()default 18;

	String name()default "小强";

	double score()default 59.5;
}
