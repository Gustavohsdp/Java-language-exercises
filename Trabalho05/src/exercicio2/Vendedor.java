package exercicio2;

public class Vendedor extends Empregado {
  private double valorVendas;
  private int qntVendas;

  public Vendedor(String nome) {
    super(nome);
  }

  public double getValorVendas() {
    return this.valorVendas;
  }

  public void setValorVendas(double valorVendas) {
    this.valorVendas = valorVendas;
  }

  public int getQntVendas(int qntVendas) {
    return this.qntVendas;
  }

  public void setQntVendas(int qntVendas) {
    this.qntVendas = qntVendas;
  }

  public String toString() {
    return "Nome: " + this.getNome() + '\n' + "Salario: " + this.getSalario() + '\n' + "Valor das vendas: "
        + this.getValorVendas() + '\n' + "Quantidade de vendas do vendedor: " + this.getQntVendas(qntVendas);
  }
}
