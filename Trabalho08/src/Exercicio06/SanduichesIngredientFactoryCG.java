
package Exercicio06;

import Questão4.SanduichesFactory;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory {

  PaoIF pao;
  PresuntoIF presunto;
  SaladaIF salada;
  QueijoIF queijo;

  public void CriarSanduiche() {
    pao.DefinirPao("Integral");
    presunto.DefinirPresunto("De frango");
    salada.DefinirSalada("Sem verdura");
    queijo.DefinirQueijo("Prato");
  }
}
