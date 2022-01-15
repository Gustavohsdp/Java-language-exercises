package Exercicio7;

public class Conta {

	private double Saldo;
	private double limite;

	public Conta() {
		this.Saldo = 0;
		this.limite = 0;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double s) {
		this.Saldo = s;
	}

	public void setLimite(double l) {
		this.limite = l;
	}

	public double getLimite() {
		return limite;
	}

	public void RealizarSaque(double v) throws Exception {

		if (v <= this.limite) {

			this.Saldo = this.Saldo - v;

		} else {

			throw new ExceptionCriada("Valor indisponível", this.getSaldo());

		}
	}

	private boolean isPositive(double Saldo) {

		throw new UnsupportedOperationException("Erro");

	}

	public void RealizarDeposito(double valor) {

		this.Saldo = this.Saldo + valor;

	}
}
