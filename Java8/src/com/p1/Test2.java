package com.p1;

interface i1 {

	int x = 10;

	public void m1();

}

interface i2 {
	int x = 20;

	public void m1();

}

public class Test2 implements i1, i2 {
	public static void main(String[] args) {

		System.out.println(i2.x);
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}
}
