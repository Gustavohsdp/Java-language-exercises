package exercicio04;

public abstract class Midia {

  private int codigo;
  private String nome;
  private double preco;

  public Midia() {

  }

  public Midia(int cd, double pr, String nm) {
    this.codigo = cd;
    this.preco = pr;
    this.nome = nm;
  }

  abstract public String getTipo();

  abstract public String getDetalhes();

  abstract public void inserirDados();

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  @Override
  public String toString() {
    return "Midia{" + "codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + '}';
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void printDados() {
    System.out.println("Nome= " + nome);
    System.out.println("Pre�o= " + preco);
    System.out.println("Tipo= " + getTipo());
    System.out.println("Codigo= " + codigo);
    System.out.println(getDetalhes());
  }
}
