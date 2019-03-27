package com.hema.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.hema.bean.Person;

/**
 * @author 反射
 *
 */
public class Demo5_Reflect {

	public static void main(String[] args) throws Exception {

		Class clazz = Class.forName("com.hema.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("张三",23);
		
		Method f = clazz.getMethod("eat",int.class);
		f.invoke(p,10);
		
	}

}
