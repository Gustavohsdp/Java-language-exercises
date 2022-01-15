package exercicio2;

public class Empregado extends Pessoa {
  private double salario;
  private String matricula;
  private double valorInss;

  public Empregado(String nome) {
    super(nome);
  }

  public void setSalario(double valorDoInput) {
    this.salario = valorDoInput;
  }

  public double getSalario() {
    return this.salario;
  }

  public void setMatricula(String valorDoInput) {
    this.matricula = valorDoInput;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public double valorInss() {
    this.valorInss = (this.salario * 11) / 100;

    return this.valorInss;
  }
}
