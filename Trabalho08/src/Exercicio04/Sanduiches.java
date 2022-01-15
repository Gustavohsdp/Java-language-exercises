package Exercicio04;

public interface Sanduiches {

  public void CriarSanduiche();
}

class Lanchonete_CG implements Sanduiches {

  public String Pao;
  public String Queijo;
  public String Presunto;
  public String Salada;

  public Lanchonete_CG() {
    CriarSanduiche();
  }

  public void CriarSanduiche() {
    this.Pao = "Integral";
    this.Queijo = "Prato";
    this.Presunto = "De Frango";
    this.Salada = "Sem verdura";
  }

}

class Lanchonete_JP implements Sanduiches {

  public String Pao;
  public String Queijo;
  public String Presunto;
  public String Salada;

  public Lanchonete_JP() {
    CriarSanduiche();
  }

  public void CriarSanduiche() {
    this.Pao = "Francês";
    this.Queijo = "Mussarela";
    this.Presunto = "De Frango";
    this.Salada = "Com verdura";
  }
}

class Lanchonete_RT implements Sanduiches {

  public String Pao;
  public String Queijo;
  public String Presunto;
  public String Salada;

  public Lanchonete_RT() {
    CriarSanduiche();
  }

  public void CriarSanduiche() {
    this.Pao = "Bola";
    this.Queijo = "Cheddar";
    this.Presunto = "De Peru";
    this.Salada = "Sem verdura";
  }
}
