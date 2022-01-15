package Exercicio03;

public class Teste {

	public static void main(String args[]) {
		FormaGeometricaFactory factory = new FormaGeometricaFactory();

		String nome = "Circulo";
		factory.getFormas(nome);

		String nome2 = "Triangulo";
		factory.getFormas(nome2);

		String nome3 = "Quadrado";
		factory.getFormas(nome3);
	}

}
