package com.hema.maven.test.mvnp;

public class Demo1_Abstract {

	public static void main(String[] args) {
        Demo d =new Test();
//        d.num2;
        d.method();
	}

}

abstract class Demo {
	int num1 = 10;
	final int num2= 20;
	public Demo() {}
	public  void print() {
		System.out.println("print 方法");
	}
	public abstract void method();
}

class Test extends Demo{
	public void method() {
		System.out.println("methond方法");
	}
}