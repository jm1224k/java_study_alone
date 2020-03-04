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
		
		// Ŭ���� B�� Ŭ���� A�� ������ Ÿ������ �ν��Ͻ�ȭ ���� �� Ŭ���� A�� �����ϴ� ������� Ŭ���� B�� �ȴ�. ���ÿ� Ŭ���� B���� �������̵��� ����� ���۹���� �״�� �����Ѵ�.
		System.out.println(a.x());
		System.out.println(b.x());
		System.out.println(b.y());
	}

}
