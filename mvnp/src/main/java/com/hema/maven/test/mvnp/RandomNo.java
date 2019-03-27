package com.hema.maven.test.mvnp;

import java.util.Random;

public class RandomNo {

	public static void main(String[] args) {

//		demo2();
//		demo3();
		
		Random r = new Random();
		System.out.println(r.nextInt());
		
		Random r1 = new Random(1000);
		System.out.println(r1.nextInt());
		
		Random r2 = new Random();
		System.out.println(r2.nextInt(100));
		
		
	}

	public static void demo3() {
		int num1 = (int)(Math.random()*99999+100000);
		int num2 = (int)(Math.random()*99999+100000);
		System.out.println(String.valueOf(num1)+String.valueOf(num2));
	}

	public static void demo2() {
		String result = "";
		for (int i = 0; i < 12; i++) {
			result += (int)(Math.random()*9+1);
		}
		System.out.println(result);
	}

	public static int demo1(int max,int min) {
		double floor = Math.floor(Math.random()*(max-min)+min);
		return (int)floor;
	}
	
	

}
