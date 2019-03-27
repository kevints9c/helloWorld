package com.hema.maven.test.mvnp;

import java.util.Arrays;

public class ArrayTest {

	/**
	 * @param args  
	 * int转成字符串
	 */
	public static void main(String[] args) {
		
//		demo1();
		
//		demo2();
		Integer i1 = 100;
		int i2 = i1 +100;
		System.out.println(i2);
		
				
		
		
	}

	public static void demo2() {
		int i1 = 100;
		String s1 = "" + i1;
		
		String s2 = String.valueOf(i1);
		
		Integer i = new Integer(i1);
		System.out.println(i.toString());
		
		String s3 = Integer.toString(i1);
		System.out.println(s3);
	}

	/**
	 * @param args  
	 * Character没有parseXxx
	 * z字符串转成int
	 */
	public static void demo1() {
		String s = "100";
		String s2 = "hello";
		Integer i = new Integer(s);         //字符串转成Integer
		int a =i.intValue();            //Integer转成int
		
		int b = Integer.parseInt(s);    //字符串转成int
		
		char[] c = s2.toCharArray();   //字符串转成字符数组
		System.out.println(Arrays.toString(c));
		
		String s3 = "true";
		boolean b2 = Boolean.parseBoolean(s3);
		System.out.println(b2);
	}

}
