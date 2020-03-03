package org.java_home.scope;

class C3 {
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(v);
		System.out.println(this.v);
	}
}

public class ScopeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C3 c = new C3();
		c.m();
	}

}
