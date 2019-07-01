package com.p1;

class XmlCO {

	public void genrateCOxml() {
		System.out.println("Hello XML");
	}
}

class JsonCo extends XmlCO {

	public void genrateCOxml() {

		Boolean b = true;

		if (b) {
			System.out.println("Hello Json");
		} else {
			super.genrateCOxml();
		}
	}

}

public class Test3 {

	public static void main(String[] args) {

		XmlCO xm = new JsonCo();

		xm.genrateCOxml();
	}
}
