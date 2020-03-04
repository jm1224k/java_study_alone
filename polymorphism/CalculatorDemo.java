package org.java_home.polymorphism;

abstract class Cal{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	int _sum() {
		return this.left + this.right;
	}
	
	public abstract void sum();
	public abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
}

class CalDecoPlus extends Cal{

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("+ sum :" + _sum());
	}

	@Override
	public void avg() {
		// TODO Auto-generated method stub
		System.out.println("+ avg :" + (_sum()/2));
	}
	
}

class CalDecoMinus extends Cal{

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("- sum :" + _sum());
	}

	@Override
	public void avg() {
		// TODO Auto-generated method stub
		System.out.println("- avg :" + (_sum()/2));
	}
	
}

public class CalculatorDemo {
	
	public static void execute(Cal c) {
		System.out.println("실행결과");
		c.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c1 = new CalDecoPlus();
		c1.setOperands(10, 20);
		
		Cal c2 = new CalDecoMinus();
		c2.setOperands(30, 20);
		
		execute(c1);
		execute(c2);

	}

}
