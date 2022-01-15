package Exercicio4;

public class TesteException {

	public static void main(String[] args) {

		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim metodo1");
	}

	static void metodo2() {
		try {
			System.out.println("inicio do metodo2");
			int[] array = new int[10];
			for (int i = 0; i <= 15; i++) {
				array[i] = i;
				System.out.println(i);
			}
			System.out.println("fim do metodo2");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array fora do índice: " + e.getMessage());
			System.out.println(
					"Está tentando retornar um índice do array que é inexistente. O array possui tamanho 10 e está tentando ler até o índice 15 do mesmo!!!");
		}

	}
}
