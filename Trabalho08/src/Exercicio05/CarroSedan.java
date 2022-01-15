
package Exercicio05;

public abstract class CarroSedan {

  public String Cor;
  public String Modelo;
  public String placa;
  public String Chassi;

  public void exibirInfoSedan() {
  }

}

class Siena extends CarroSedan {

  public Siena(String cor, String mod, String placa, String chassi) {
    this.Cor = cor;
    this.Modelo = mod;
    this.placa = placa;
    this.Chassi = chassi;
  }

  public void exibirInfoPopular() {
    System.out.println("Carro Sedan: Siena");
  }
}

class FiestaSedan extends CarroSedan {

  public FiestaSedan(String cor, String mod, String placa, String chassi) {
    this.Cor = cor;
    this.Modelo = mod;
    this.placa = placa;
    this.Chassi = chassi;
  }

  public void exibirInfoPopular() {
    System.out.println("Carro Sedan: Fiesta Sedan");
  }
}
