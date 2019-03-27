
package com.hema.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.hema.bean.Person;

public class Demo4_Field {

	public static void main(String[] args) throws Exception {

		Class clazz = Class.forName("com.hema.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("张三",23);
		Field f = clazz.getDeclaredField("name");
		f.setAccessible(true);
		f.set(p, "李四");
		System.out.println(p);
		
		
		
				
	}

}
