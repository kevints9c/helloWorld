package com.hema.模板设计;

public class Template {

	public static void main(String[] args) {

		Demo d = new Demo();
		System.out.println(d.getTime());
	}

}

abstract class GetTime {
	public final long getTime() {
		long Start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		return end - Start;
	}
	public abstract void code();
}


class Demo extends GetTime {

	@Override
	public void code() {
		int i = 1;
		while (i<100000) {
			System.out.println("x");
			i++;
		}
	}
	
}