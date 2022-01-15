package exercicio01;

public class Animal {

  private String nome;
  private double peso;

  public Animal(String nome) {
    this.nome = nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getPeso() {
    return this.peso;
  }
}