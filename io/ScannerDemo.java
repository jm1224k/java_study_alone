package org.java_home.io;

//scanner�� ����ϱ� ���Ͽ� load
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		//Scanner ��ü ����� system.in = ����ڰ� �Է��� ���� scan
		Scanner sc = new Scanner(System.in);
		//scanner ��ü�� ����ڰ� �Է��� ���� scanning, ���ڸ� �Է��ض�.
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}

}
