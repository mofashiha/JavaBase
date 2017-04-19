package com.xinan.Enum;

public enum ColorEnum2 {
   RED("红色",1), BLUE("蓝色",2),YELLOW("黄色",3),BLACK("黑色",4),GREEN("绿色",5); 
	private String color;
	private int num;
	 private ColorEnum2(String color,int num) {
	        this.color=color;
	        this.num=num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
