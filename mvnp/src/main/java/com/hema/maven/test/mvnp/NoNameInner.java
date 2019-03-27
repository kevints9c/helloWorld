package com.hema.maven.test.mvnp;

public class NoNameInner {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
		Class clazz = o.getClass();
		System.out.println(clazz);
		
		
		
	}

}

interface Inter{
	public void print();
}

class Outer {
	class Inner implements Inter{
		public void print() {
			System.out.println("print");
		}
	}
	public void method() {
		/*Inner i = new Inner();
		i.print();*/
		new Inter() {                        //实现Inter接口
			public void print() {
				System.out.println("print");
			}
		}.print();              //Inter的子类对象
	}
	
}