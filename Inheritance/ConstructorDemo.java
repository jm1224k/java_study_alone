package org.java_home.Inheritance;

class Cal {
	int left, right;
	
	public Cal(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOperand(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class SubCal extends Cal{
	public SubCal(int left, int right) {
		super(left, right);
	}
	
	public void sub() {
		System.out.println(this.left - this.right);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubCal c1 = new SubCal(10, 20);
		c1.sub();
		c1.sum();
		c1.avg();
	}

}
