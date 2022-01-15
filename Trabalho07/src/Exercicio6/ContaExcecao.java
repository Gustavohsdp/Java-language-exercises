package Exercicio6;

public class ContaExcecao extends Exception {

	private double limite;
	private double Saldo;

	public ContaExcecao() {
		this.Saldo = 0;
		this.limite = 0;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double Saldo) {
		this.Saldo = Saldo;
	}

	public void deposita(double valor) {
		this.Saldo = this.Saldo + valor;
	}

	public void saca(double valor) throws Exception {

		if (valor < this.limite) {
			this.Saldo = this.Saldo - valor;
		} else {
			throw new Exception("Valor do saque maior que o saldo");
		}

	}

	private boolean isPositive(double Saldo) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
