package Exercicio04;

public class SanduichesFactory {

  public Sanduiches getSanduiches(String sanduiche) {

    if (sanduiche.equals("Lanchonete_CG"))
      return new Lanchonete_CG();
    if (sanduiche.equals("Lanchonete_JP"))
      return new Lanchonete_JP();
    if (sanduiche.equals("Lanchonete_RT"))
      return new Lanchonete_RT();
    return null;
  }

}
