
package Exercicio05;

public class FabricaDeCarro {

  public CarroSedan criarCarroSedan() {
    return new Siena("Prata", "Siena", "ABC-1234", "123456789");
  }

  public CarroPopular criarCarroPopular() {
    return new Fiesta("Prata", "Fiesta", "ABC-1234", "123456789");
  }

}
