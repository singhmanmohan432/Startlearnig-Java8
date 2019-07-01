package com.manmohan.p1;

class Hello {

}

class Hai extends Hello {
	public void m1() {
		System.out.println("Hello Mr. Singh I am in M1()");
	}
}

public class Test2 {

	public static void main(String[] args) {

		Hello h1 = new Hai();
		((Hai) h1).m1();

	}
}
