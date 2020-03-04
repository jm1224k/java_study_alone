package org.java_home.overriding;

class Cal{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public int avg() {
		return ((this.left + this.right)/2);
	}
}

class subCal extends Cal{
	
	public void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) +"입니다.");
	}
	
	public int avg() {
		return super.avg() + 10;
	}
	
	public void sub() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subCal c1 = new subCal();
		
		c1.setOperands(10, 30);
		c1.sub();
		c1.sum();
		System.out.println(c1.avg());
	}

}
