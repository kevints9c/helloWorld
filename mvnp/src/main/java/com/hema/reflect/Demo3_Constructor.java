package com.hema.reflect;

import java.lang.reflect.Constructor;

import com.hema.bean.Person;

public class Demo3_Constructor {

	public static void main(String[] args) throws Exception {

		Class clazz = Class.forName("com.hema.bean.Person");
//		Person p = (Person) clazz.newInstance();
		Constructor c = clazz.getConstructor(String.class,int.class); //获取有参构造
		Person p = (Person) c.newInstance("张三",23);
		System.out.println(p);
	}

}
