package exercicio2;

public class Cliente extends Pessoa {
  private double valorDivida;
  private int anoNascim;

  public Cliente(String nome) {
    super(nome);
  }

  public double getValorDivida(double valorDivida) {
    return this.valorDivida;
  }

  public void setGetValorDivida(double valorDivida) {
    this.valorDivida = valorDivida;
  }

  public int getAnoNascim(int anoNascim) {
    return this.anoNascim;
  }

  public void setAnoNascim(int anoNascim) {
    this.anoNascim = anoNascim;
  }

  public String toString() {
    return "Name: " + this.getNome() + '\n' + "Idade: " + this.getIdade() + '\n' + "Sexo: " + this.getSexo() + '\n'
        + "Valor da divida: " + this.valorDivida + '\n' + "Ano de nascimento do cliente: " + this.anoNascim;
  }
}
