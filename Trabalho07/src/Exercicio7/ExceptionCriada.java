package Exercicio7;

public class ExceptionCriada extends UnsupportedOperationException {

	private String mensagem;
	// aqui adicionei a variavel saldo
	private double saldo;

	// agora o construtor pede o valor do saldo
	public ExceptionCriada(String mensagem, double saldo) {
		this.mensagem = mensagem;
		this.setSaldo(saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
