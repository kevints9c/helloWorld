package com.hema.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2_Reflect {

	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
/*//不用反射，用多态
		Juicer j = new Juicer();
		j.run(new Apple());
		j.run(new Orange());*/

/*		//反射
		BufferedReader br = new BufferedReader(new FileReader("config.prop"));
		Class clazz = Class.forName(br.readLine());
		Fruit f = (Fruit) clazz.newInstance();
		Juicer j = new Juicer();
		j.run(f);*/
		
		
	}

}
class Juicer {
	public void run(Fruit f) {

		f.squeeze();
		
	}
}

interface Fruit {
	public void squeeze();
}

class Apple implements Fruit {
	public void squeeze() {
		System.out.println("炸一杯苹果汁");
	}
}

class Orange implements Fruit {
	public void squeeze() {
		System.out.println("炸一杯橘子汁");
	}
}