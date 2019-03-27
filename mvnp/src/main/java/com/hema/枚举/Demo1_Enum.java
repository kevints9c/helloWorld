package com.hema.枚举;

public class Demo1_Enum {

//	private Demo1_Enum() {}   //不让其他类创建本类对象
	public static void main(String[] args) {
		
		
//	demo1();
		
		
//		demo2();
		Week3 mon = Week3.MON;
		mon.show();
		
		
		
}
	public static void demo2() {
		Week2 mon = Week2.MON;
		System.out.println(mon.getName());
	}

	public static void demo1() {
		Week Mon = new Week();
		System.out.println(Mon);
	}
}