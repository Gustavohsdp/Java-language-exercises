package Exercicio05;

public abstract class CarroPopular {

  public String Cor;
  public String Modelo;
  public String placa;
  public String Chassi;

  public void exibirInfoPopular() {
  }

}

class Palio extends CarroPopular {

  public Palio(String cor, String mod, String placa, String chassi) {
    this.Cor = cor;
    this.Modelo = mod;
    this.placa = placa;
    this.Chassi = chassi;
  }

  public void exibirInfoPopular() {
    System.out.println("Carro popular: Palio");
  }
}

class Fiesta extends CarroPopular {

  public Fiesta(String cor, String mod, String placa, String chassi) {
    this.Cor = cor;
    this.Modelo = mod;
    this.placa = placa;
    this.Chassi = chassi;
  }

  public void exibirInfoPopular() {
    System.out.println("Carro popular: Fiesta");
  }
}