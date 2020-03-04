package org.java_home.polymorphism;

class A{
	public String x() {
		return "A.x";
	}
}

class B extends A{
	public String x() {
		return "B.x";
	}
	public String y() {
		return "B.y";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		B b = new B();
		
		// 클래스 B를 클래스 A의 데이터 타입으로 인스턴스화 했을 때 클래스 A에 존재하는 멤버만이 클래스 B가 된다. 동시에 클래스 B에서 오버라이딩한 멤버의 동작방식은 그대로 유지한다.
		System.out.println(a.x());
		System.out.println(b.x());
		System.out.println(b.y());
	}

}
