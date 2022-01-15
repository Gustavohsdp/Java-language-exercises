package exercicio01;

public class Cachorro extends Animal {
  private String raca;

  public Cachorro(String nome) {
    super(nome);
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public String getRaca() {
    return this.raca;
  }

  public String toString() {
    return "Nome: " + super.getNome() + "\n" + "Peso: " + super.getPeso() + "\n" + "Raca: " + this.raca;
  }
}
