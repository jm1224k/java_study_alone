package org.java_home.classinstance;

class C1{
	static int static_variable = 1;
	int instance_variable = 2;
	
	static void static_static() {
		System.out.println(static_variable);
	}
	
	static void static_instance() {
//		System.out.println(instance_variable);
	}
	
	void instance_static() {
		System.out.println(static_variable);
	}
	
	void instance_instance() {
		System.out.println(instance_variable);
	}
}

public class ClassMemberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1();
		
//		c.static_static(); // -> O
//		c.static_instance(); // -> X
//		
//		c.instance_static(); // -> O
//		c.instance_instance(); // -> O
//		
//		C1.static_static(); // -> O
//		C1.static_instance(); // -> X
	}

}
