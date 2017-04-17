package com.xinan.Enum;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		/*
		 * for (ColorEnum ce:ColorEnum.values()) {
		 * //System.out.println(ce.toString());
		 * System.out.println(ce.name()+"---"+ce.ordinal()); } for (ColorEnum2
		 * ce:ColorEnum2.values()) { //System.out.println(ce.toString());
		 * System.out.println(ce.name()+"---"+ce.ordinal()+"---"+ce.getColor()+
		 * "---"+ce.getNum()); }
		 */
		ColorEnum2 ce2 = ColorEnum2.RED;
		switch (ce2) {
		case RED:
			System.out.println("RED:" + ce2.getColor() + "----" + ce2.getNum());
			break;
		case BLACK:
			System.out.println("BLACK:" + ce2.getColor() + "----" + ce2.getNum());
			break;
		default:
			break;
		}
		ColorI cI = ColorEnum3.RED;// 枚举不能被实例化
		cI.print();
		System.out.println(cI.get());

		EnumSet<ColorEnum3> colorset = EnumSet.allOf(ColorEnum3.class);
		for (ColorEnum3 color : colorset) {
			System.out.println(color);
		}
		EnumMap<ColorEnum3, String> colorMap = new EnumMap(ColorEnum3.class);
		colorMap.put(ColorEnum3.RED, "一");
		colorMap.put(ColorEnum3.BLUE, "二");
		colorMap.put(ColorEnum3.YELLOW, "三");
		colorMap.put(ColorEnum3.BLACK, "四");
		colorMap.put(ColorEnum3.GREEN, "五");
		for (Entry<ColorEnum3, String> colorEnum3 : colorMap.entrySet()) {
			System.out.println(colorEnum3.getKey().name()+"--"+colorEnum3.getKey().ordinal()+colorEnum3.getKey().getColor() +"--"+colorEnum3.getKey().ordinal()+ "--" + colorEnum3.getKey().getNum() + "--"
					+ colorEnum3.getValue());

		}
		ColorEnum3 c=ColorEnum3.RED;
		ColorEnum3 c1=ColorEnum3.BLACK;
		int comparato=c.compareTo(c1);
		if(comparato<0){
			System.out.println(c.getColor()+"在"+c1.getColor()+"前面");
		}else if(comparato==0){
			System.out.println(c.getColor()+"在当前位置");
		}else{
			System.out.println(c.getColor()+"在"+c1.getColor()+"后面");
		}
		
	}

}
