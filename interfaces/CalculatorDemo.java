package org.java_home.interfaces;

class Cal implements Calculatable{
	
	int first, second, third;
	
	@Override
	public void setOperands(int first, int second, int third) {
		// TODO Auto-generated method stub
		this.first = first;
		this.second = second;
		this.third = third;
	}

	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return this.first + this.second + this.third;
	}

	@Override
	public int avg() {
		// TODO Auto-generated method stub
		return (this.sum()/3);
	}
	
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c = new Cal();
		c.setOperands(10, 20, 30);
		System.out.println(c.sum());
		System.out.println(c.avg());
	}

}
