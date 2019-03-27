package com.hema.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {

	/**
	 * @param args,泛型反射（泛型擦除）
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(111);
		list.add(222);
		list.add(333);
		
		Class clazz = Class.forName("java.util.ArrayList");
		Method m = clazz.getMethod("add", Object.class);
		m.invoke(list, "abc");
		System.out.println(list);
	}

}
