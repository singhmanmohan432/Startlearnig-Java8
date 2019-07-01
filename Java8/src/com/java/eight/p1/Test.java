package com.java.eight.p1;

interface i1 {

	default void m1() {
		System.out.println("Hello This my java-8 ::: Interface -I1");
	}
}

interface i2 {

	default void m1() {
		System.out.println("Hello This my java-8 ::: Interface -I2");
	}
}

class Hello implements i1, i2 {

	@Override
	public void m1() {
		i2.super.m1();
	}

}

public class Test {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		h1.m1();
	}
}
