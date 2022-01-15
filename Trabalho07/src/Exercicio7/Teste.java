package Exercicio7;

public class Teste {

	public static void main(String[] args) throws Exception {

		try {
			Conta conta = new Conta();

			// Operações
			conta.RealizarDeposito(5000);

			conta.setLimite(5000);

			conta.RealizarSaque(20000);

		} catch (ExceptionCriada e) {

			System.out.println("Erro \n" + e.getSaldo());

		}
	}
}
