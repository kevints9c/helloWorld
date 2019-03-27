package com.hema.reflect;

import java.lang.reflect.Field;

public class Tool {

	public static void main(String[] args) {

		
	}

	public void setProperty(Object obj,String PropertyName,Object value) throws Exception {
		Class clazz = obj.getClass();
		Field f = clazz.getDeclaredField(PropertyName);
		f.setAccessible(true);
		f.set(obj, value);
		
	}
}
