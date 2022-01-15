
package Exercicio05;

public abstract class FabricaFord {

  public CarroPopular criarCarroPopular() {
    return new Fiesta("Prata", "Fiesta", "ABC-1234", "123456789");
  }

}
