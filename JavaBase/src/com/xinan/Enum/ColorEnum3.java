package com.xinan.Enum;

import lombok.Getter;
import lombok.Setter;
@Getter
public enum ColorEnum3 implements ColorI {//枚举实现接口
	 RED("红色",1), BLUE("蓝色",2),YELLOW("黄色",3),BLACK("黑色",4),GREEN("绿色",5); 
	
	@Setter
		private String color;
	@Setter
		private int num;
		 private  ColorEnum3(String color,int num) {
		        this.color=color;
		        this.num=num;
		}

	@Override
	public void print() {
		
		System.out.println("我是print方法打印的内容：" + this.color + "--" + this.num);
	}

	@Override
	public String get() {
		
		return "ColorEnum3:" + this.color + "--" + this.num;
	}

}
