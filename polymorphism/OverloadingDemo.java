package org.java_home.polymorphism;

class O {
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O o = new O();
		o.a(1);
		o.a("one");
	}

}
