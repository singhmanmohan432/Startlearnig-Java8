package com.p1;

class Hello {
	public void m1() {
		System.out.println("Hello Mr. Manmohan");
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello Test");
		Hello h1 = new Hello();
		h1.m1();
	}
}
