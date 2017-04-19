package com.xinan.Exception;



import java.util.Scanner;



public class Practice {

	public static void main(String[] args) {
		try {
			div();
		} catch (WodeException e) {
			
    System.out.println("输入错误，请输入1-3之间的数字\t");
			e.printStackTrace();
		}
		finally {
			
			System.out.println("欢迎提出建议！");
		
		}
	}
		public static void div()throws WodeException {
	@SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
	System.out.println("请输入课程带号1~3之间的数字：");
	int a=input.nextInt();	
	if(a==1){
		System.out.println("The Program C");
	}else if(a==2) {
		System.out.println("The Program C++");
	}else if(a==3) {
		System.out.println("The Program Java");
	}else {
		throw new WodeException();
	}
		}
	

}

