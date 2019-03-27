package com.hema.reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("properties"));
		Class clazz = Class.forName(br.readLine());
		DemoClass d = (DemoClass) clazz.newInstance();
		d.run();
	}

}
