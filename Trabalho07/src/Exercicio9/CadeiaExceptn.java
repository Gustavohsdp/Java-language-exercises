package Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class CadeiaExceptn {

	public static void main(String[] args) {

		try {

			someMethod();
		} catch (Exception error) {

			error.printStackTrace();
		}
	}

	public static void someMethod() throws ArithmeticException {
		someMethod2();
	}

	public static void someMethod2() throws ArrayIndexOutOfBoundsException {

		List<String> meuArray = new ArrayList<String>();
		meuArray.add("Valor 001");
		meuArray.add("Valor 002");
		meuArray.add("Valor 003");
		meuArray.add("Valor 004");
		meuArray.add("Valor 005");

		meuArray.get(100);
	}
}
