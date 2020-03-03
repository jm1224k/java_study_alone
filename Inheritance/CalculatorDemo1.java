package org.java_home.Inheritance;

class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
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

class SubstractableCalculator extends Calculator {
	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {
	
	public static void main(String[] args) {
		
		SubstractableCalculator C1 = new SubstractableCalculator();
		C1.setOperands(10, 20);
		C1.subtract();
		C1.avg();
		C1.sum();
	}

}
