package com.hema.枚举2;

public class Demo2_Enum {

	public static void main(String[] args) {

//		demo1();
//		
		Week2 mon = Week2.valueOf(Week2.class, "MON");   //通过字节码对象获取枚举项
		System.out.println(mon);
		Week2[] arr = Week2.values();
		for (Week2 week2 : arr) {
			System.out.println(week2);
		}
		
	}

	public static void demo1() {
		Week2 mon = Week2.MON;
		Week2 tue = Week2.TUE;
		Week2 wed = Week2.WED;
		
		/*System.out.println(mon.ordinal());
		System.out.println(tue.ordinal());
		System.out.println(wed.ordinal());
		System.out.println(mon.compareTo(wed));*/   //比较编号
		
		System.out.println(mon.name());
		System.out.println(mon.toString());  //调用重写后的toString
	}

}
