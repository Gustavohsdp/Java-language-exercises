
package Exercicio05;

public abstract class FabricaFiat {

  public CarroSedan criarCarroSedan() {
    return new Siena("Prata", "Siena", "ABC-1234", "123456789");
  }

}
