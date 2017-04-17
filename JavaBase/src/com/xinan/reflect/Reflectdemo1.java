package com.xinan.reflect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
public class Reflectdemo1 {

	private static final String Separator = System.getProperty("line.separator");

	public static void main(String[] args) throws Exception{
    FileWriter fr=new FileWriter("Integer.txt");
	BufferedWriter bw=new BufferedWriter(fr);
	Class<?> clazz=Integer.class;
	Field[] fs=clazz.getDeclaredFields();
	StringBuffer sb=new StringBuffer();
	sb.append(Modifier.toString(clazz.getModifiers())+" class "+clazz.getSimpleName()+"{"+Separator);
	for (Field field : fs) {
		sb.append("\t");
		sb.append(Modifier.toString(field.getModifiers())+" ");
		sb.append(field.getType().getSimpleName()+" ");
		 sb.append(field.getName()+";"+Separator);
	}
	sb.append("}");
	System.out.println(sb);
	bw.write(new String(sb));
	bw.flush();

	}
	}


