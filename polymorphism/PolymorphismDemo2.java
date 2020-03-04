package org.java_home.polymorphism;

interface I2 {
	public String A();
}

interface I3 {
	public String B();
}

class D implements I2, I3 {
	
	public String A() {
		return "A";
	}
	
	public String B() {
		return "B";
	}
}

public class PolymorphismDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		// 하나의 클래스가 다양한 형태를 띄게 되는 것.
		obj.A();
		obj.B();
		
		objI2.A();
		
		objI3.B();
	}

}
