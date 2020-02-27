package org.java_home.io;

import java.util.Scanner;
import java.io.*;

public class Scanner3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외 처리
		try {
			//out.txt의 정보를 가진 새로운 파일 객체를 생성
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		} catch(FileNotFoundException e) {
			//error의 내용을 화면에 출력해라
			e.printStackTrace();
		}

	}

}
