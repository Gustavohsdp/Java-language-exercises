
package Exercicio06;

public class FabricaDeSanduichesRT implements SanduichesIngredientFactory {

  PaoIF pao;
  PresuntoIF presunto;
  SaladaIF salada;
  QueijoIF queijo;

  public void CriarSanduiche() {
    pao.DefinirPao("Bola");
    presunto.DefinirPresunto("De peru");
    salada.DefinirSalada("Sem verdura");
    queijo.DefinirQueijo("Cheedar");
  }
}
