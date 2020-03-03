package org.java_home.Inheritance;

class MultiplicationableCalculator extends Calculator {
	public void mul() {
		System.out.println(this.left * this.right);
	}
}

class DivisionableCalculator extends MultiplicationableCalculator {
	public void div() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationableCalculator C1 = new MultiplicationableCalculator();
		C1.setOperands(10, 20);
		C1.sum();
		C1.avg();
		C1.mul();
		
		DivisionableCalculator C2 = new DivisionableCalculator();
		C2.setOperands(50, 25);
		C2.div();
		C2.mul();
	}

}
