package Exercicio01;

public class Singleton {
	private static Singleton InstanciaSingleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return InstanciaSingleton;
	}
}