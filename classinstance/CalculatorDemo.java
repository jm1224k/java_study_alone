package org.java_home.classinstance;

class Calculator {
	static double PI = 3.14;
	static int base = 20;
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		System.out.println((this.left + this.right + base)/2);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		System.out.println(c1.PI);
		c1.sum();
		c1.avg();
		
		Calculator.base = 0;
		Calculator c2 = new Calculator();
		c2.setOperands(0, 80);
		System.out.println(c2.PI);
		c2.sum();
		c2.avg();
		
		System.out.println(Calculator.PI);

	}

}
