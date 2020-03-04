package org.java_home.accessmodifier;

class Cal{
	private int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	private int _sum() {
		return this.left+this.right;
	}
	
	public void sumDecoPlus() {
		System.out.println("++++"+_sum()+"++++");
	}
	
	public void sumDecoMinus() {
		System.out.println("----"+_sum()+"----");
	}
}

public class AcessDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c1 = new Cal();
		c1.setOperands(10, 20);
		// Decoration Minus!
		c1.sumDecoMinus();
		c1.sumDecoPlus();
	}

}
