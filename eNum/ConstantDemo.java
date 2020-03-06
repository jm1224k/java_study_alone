package org.java_home.eNum;

enum Fruit{
	Apple("red"), Peach("pink"), Banana("yellow");
	private String color;
	Fruit(String color){
		System.out.println("Call Constructor "+this);
		this.color = color;
	}
	String getColor() {
		return this.color;
	}
}

enum Company{
	Google, Apple, Oracle;
}

public class ConstantDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit type = Fruit.Apple;
		switch(type) {
		case Apple:
			System.out.print(57);
			break;
		case Peach:
			System.out.print(34);
			break;
		case Banana:
			System.out.print(93);
			break;
		}
		System.out.println("kcal"+type.getColor());
		
		for (Fruit f : Fruit.values()) {
			System.out.println(f+", "+f.getColor());
		}
	}

}
