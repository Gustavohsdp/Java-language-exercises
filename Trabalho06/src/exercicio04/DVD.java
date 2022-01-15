package exercicio04;

import java.util.Scanner;

public class DVD extends Midia {

  private int NumFaixas;

  public DVD() {
  }

  public DVD(int cd, double pr, String nm, int numFaixas) {
    super(cd, pr, nm);
    this.NumFaixas = numFaixas;
  }

    public String toString() {
        return "DVD{" + "NumFaixas=" + NumFaixas + '}';
    }

  public String getTipo() {
    return "DVD";
  }
  
  public int getnFaixas() {
    return NumFaixas;
  }

  public void setnFaixas(int nFaixas) {
    this.NumFaixas = nFaixas;
  }

  public String getDetalhes() {
    return "Numero de faixas: " + NumFaixas;
  }

  public void inserirDados() {
    Scanner scan = new Scanner(System.in);
    System.out.printf("Nome do DVD: ");
    this.setNome(scan.nextLine());
    System.out.printf("DCódigo do DVD: ");
    this.setCodigo(scan.nextInt());
    System.out.printf("Preço do DVD: ");
    this.setPreco(scan.nextDouble());
    System.out.printf("Número de faixas: ");
    NumFaixas = scan.nextInt();
  }

}
