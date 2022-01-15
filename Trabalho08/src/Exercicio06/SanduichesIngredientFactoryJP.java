
package Exercicio06;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory {

  PaoIF pao;
  PresuntoIF presunto;
  SaladaIF salada;
  QueijoIF queijo;

  public void CriarSanduiche() {
    pao.DefinirPao("Francês");
    presunto.DefinirPresunto("De frango");
    salada.DefinirSalada("Com verdura");
    queijo.DefinirQueijo("Mussarela");
  }

}
