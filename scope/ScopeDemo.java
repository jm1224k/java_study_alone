package org.java_home.scope;

public class ScopeDemo {

	static int i = 5;
	
	static void a() {
		int i = 10;
		b();
	}
	
	static void b() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
	}

}
