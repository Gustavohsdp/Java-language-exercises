package Exercicio1;

import java.util.Objects;

public class Supermercado {

  /**
   * @return the count
   */
  public static int getCount() {
    return count;
  }

  /**
   * @param aCount the count to set
   */
  public static void setCount(int aCount) {
    count = aCount;
  }

  private String nome;
  private double preço;
  private int ID;
  private static int count;

  public Supermercado(String nome, double preco, int id) {
    super();
    this.nome = nome;
    this.preço = preco;
    this.ID = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreço() {
    return preço;
  }

  public void setPreço(double preço) {
    this.preço = preço;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Supermercado other = (Supermercado) obj;
    if (!Objects.equals(this.nome, other.nome)) {
      return false;
    }
    if (Double.doubleToLongBits(this.preço) != Double.doubleToLongBits(other.preço)) {
      return false;
    }
    if (this.ID != other.ID) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Supermercado{" + "nome=" + nome + ", pre\u00e7o=" + preço + ", ID=" + ID + '}';
  }

}
