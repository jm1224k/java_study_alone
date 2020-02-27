package org.java_home.io;

//scanner를 사용하기 위하여 load
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		//Scanner 객체 만들기 system.in = 사용자가 입력할 값을 scan
		Scanner sc = new Scanner(System.in);
		//scanner 객체는 사용자가 입력한 값을 scanning, 숫자를 입력해라.
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}

}
