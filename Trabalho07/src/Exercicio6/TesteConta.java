package Exercicio6;

public class TesteConta {
	public static void main(String[] args) throws Exception {

		try {
			ContaExcecao minhaConta = new ContaExcecao();
			minhaConta.deposita(100);
			minhaConta.setLimite(100);
			minhaConta.saca(1000);
		} catch (IllegalArgumentException e) {
		}
	}
}
