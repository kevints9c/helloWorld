package com.hema.maven.test.mvnp;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 * 多态
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
//    	demo1();
//    	demo2();
		method(new Cat());
		method(new Dog());

	}

	public static void method(Animal a) {
		/*
		 * Cat c = (Cat)a; c.eat(); c.catchMouse();
		 */
		if (a instanceof Cat) {
			Cat c = (Cat) a;
			c.eat();
			c.catchMouse();

		} else if (a instanceof Dog) {
			Dog d = (Dog) a;
			a.eat();
			d.lookHome();
		} else {
			a.eat();
		}
	}

	public static void demo2() {
		Scanner sc = new Scanner(System.in);

		int result = (int) (Math.random() * 100) + 1;
		System.out.println("请猜一个1-100整数");
		while (true) {
			int guessNum = sc.nextInt();
			if (guessNum < result) {
				System.out.println("小了");
			} else if (guessNum > result) {
				System.out.println("大了");
			} else {
				System.out.println("恭喜！你猜对了");
				break;
			}
		}
	}

	public static void demo1() {
		System.out.println(010);
		char c1 = 3;
		char c2 = 4;
		char c3 = 5;
		char c4 = 6;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		// 逻辑异或^：两边相同为false，两边不同为true
		// 短路与&&:左边为false,则右边不执行
		// 短路或||：左边是true，右边不执行

		// 位运算符：& 、|、~、^
		// 一个数对另一个数位异或两次，值保持不变
		System.out.println(12 << 2);// 向左移动n位，就是乘以2的n次幂
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		double d = Math.random();
		System.out.println((int) (d * 100) + 1);

	}
}

class Animal {
	public void eat() {
		System.out.println("吃饭");
	}

}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");

	}

	public void catchMouse() {
		System.out.println("猫捉老鼠");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃肉");
	}

	public void lookHome() {
		System.out.println("看家");
	}
}
