package org.java_home.exception;

import java.io.IOException;

class E{
	void throwAtrithmeticExceptions() {
		throw new ArithmeticException();
	}
	void throwIOException(){
		try{
			throw new IOException();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	void throwIOException2() throws IOException {
		throw new IOException();
	}
}

public class ThrowExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
