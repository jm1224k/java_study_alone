package org.java_home.exception;

class DivideException extends RuntimeException{
	DivideException(){
		super();
	}
	DivideException(String message){
		super(message);
	}
}

class MyCal{
	int left, right;
	public void setOperands(int left, int right){
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(this.right == 0) {
			throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
		}
		System.out.println(this.left/this.right);
	}
}

public class MyExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCal c1 = new MyCal();
		c1.setOperands(10, 0);
		c1.divide();
	}

}
