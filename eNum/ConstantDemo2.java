package org.java_home.eNum;

interface _FRUIT{
	int APPLE = 1, PEACH = 2, BANANA = 3;
}

interface _COMPANY{
	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}

public class ConstantDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int type = _FRUIT.APPLE;
		switch(type) {
		case _FRUIT.APPLE:
			System.out.print(57);
			break;
		case _FRUIT.PEACH:
			System.out.print(34);
			break;
		case _FRUIT.BANANA:
			System.out.print(93);
			break;
		}
		System.out.println("kcal");
	}

}
