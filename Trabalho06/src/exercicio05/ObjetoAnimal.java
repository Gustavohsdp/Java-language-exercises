package exercicio05;

public class ObjetoAnimal implements Animal {

  private String Especie;
  private String Animal;

  public void setEspecie(String Especie) {
    this.Especie = Especie;
  }

  public void setAnimal(String Animal) {
    this.Animal = Animal;
  }

  public String getEspecie() {
    return Especie;
  }

  public String getAnimal() {
    return Animal;
  }

}