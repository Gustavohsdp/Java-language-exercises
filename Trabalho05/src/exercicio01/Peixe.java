package exercicio01;

public class Peixe extends Animal {
  private String tipoHabitat;

  public Peixe(String nome) {
    super(nome);
  }

  public void setTipoHabitat(String tipoHabitat) {
    this.tipoHabitat = tipoHabitat;
  }

  public String getHabitat() {
    return this.tipoHabitat;
  }

  public String toString() {
    return "Nome: " + super.getNome() + "\n" + "Peso: " + super.getPeso() + "\n" + "Tipo de Habitat: "
        + this.tipoHabitat;
  }
}
