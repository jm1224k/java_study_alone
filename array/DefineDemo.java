package org.java_home.array;

public class DefineDemo {

	public static void main(String[] args) {
		
		String[] classGroup = {"choi", "chae", "han", "e"};
		
		for(int i = 0; i < classGroup.length; i++) {
			System.out.println(classGroup[i] + " took a class.");
		}
		
		for(String e : classGroup) {
			System.out.println(e + " took a class.");
		}
	}

}
