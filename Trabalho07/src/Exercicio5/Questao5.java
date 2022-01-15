package Exercicio5;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Eu sei dividir!");
		aqui: try {
			System.out.println("Informe o primeiro valor: ");
			int x = teclado.nextInt();
			System.out.println("Informe o segundo valor: ");
			int y = teclado.nextInt();
			double r = (x / y);
			System.out.println("O resultado da soma é " + r);
		} catch (ArithmeticException e) {
			System.out.println("Impossível realizar divisão por 0");

		}
	}
}
