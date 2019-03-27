package com.hema.maven.test.mvnp;

import java.util.Scanner;

public class Demo2_String {

	public static void main(String[] args) {

//		demo1();
//		demo2();
//		
//		demo3();
//		demo4();
//		demo5();
		
//		int[] arr = {1,2,3};
//		System.out.println(array2string(arr));
		
//		System.out.println(revString());
		
		int[] arr = {32,23,10,35,46};
//		bubleSort(arr);
		selectSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		
		
		
	}

    //选择排序
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
	}


	//冒泡排序
	public static void bubleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp ;
				}
			}
			
		}
	}

	public static String revString() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		StringBuffer sb = new StringBuffer(line);
		sb.reverse();
		return sb.toString();
	}

	public static String array2string(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i==arr.length-1) {
				sb.append(arr[i]).append("]");
			}else {
				sb.append(arr[i]).append(",");
			}
		}
		return sb.toString();
	}

	public static void demo5() {
		String s1 = "bcd";
		String s2 = "bcf";
		int a =s1.compareTo(s2);
		System.out.println(a);
		char c1 ='黑';
		char c2 ='百';
		System.out.println(c1+0);
		
		String s3 = "HeNm";
		String s4 = "heNM";
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4));
	}

	public static void demo4() {
		int[] arr = {1,2,3};
		String s = "[";
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				s= s+ arr[i]+"]";
			}else {
			s =s + arr[i]+", ";
			}
		}
		System.out.println(s);
	}

	public static void demo3() {
		String s = "woaiHnsMNVs";
		String s1 = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(s1);
	}

	public static void demo2() {
		String s = "heima";
		char[] arr = s.toCharArray(); ///将字符串转成字符数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		char[] b = {'a','b','c'};
		String s1 = String.valueOf(b);//将字符数组转成字符串
		System.out.println(s1);
	}

	public static void demo1() {
		byte[] arr1 = {97,98,99};
		String s1 = new String(arr1);
		System.out.println(s1);
		
		byte[] arr2 = {97,98,99,100,101,102,103};
		String s2 = new String(arr2, 2, 3);
		System.out.println(s2);
		
		char[] arr3 = {'a','b','c'};
		String s3 = new String(arr3);
		System.out.println(s3);
		
		
		String s4 = "你好你好";
		byte[] b1 = s4.getBytes();               //编码
		for (int i = 0; i < b1.length; i++) {
			System.out.print(b1[i]+"");
		}
	}

}
