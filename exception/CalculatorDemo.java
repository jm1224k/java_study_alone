package org.java_home.exception;

class Cal{
	int left, right;
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		try {
			System.out.println("��� ����� ");
			System.out.println(this.left/this.right);
			System.out.println("�Դϴ�.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c1 = new Cal();
		c1.setOperands(10, 0);
		c1.divide();
	}

}
