package org.java_home.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//user가 입력하는 값이 숫자이면 계속 실행
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();

	}

}
