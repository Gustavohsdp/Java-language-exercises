package Exercicio10;

public class Calculator {

	public double div(double x, double y) throws InvalidOperationException {
		if (y == 0) {
			InvalidOperationException e = new InvalidOperationException("Denominador = 0!");
			e.printStackTrace();
			return 0;
		}
		return x / y;
	}

	public double log(double num) throws InvalidOperationException {
		if (num == 0) {
			InvalidOperationException e = new InvalidOperationException("Numero = 0!");
			e.printStackTrace();
			return 0;
		}
		return Math.log10(num);
	}

	public char[] log10(double x) {
		return null;
	}
}
