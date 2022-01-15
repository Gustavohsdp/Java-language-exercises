package exercicio04;

import java.util.Scanner;

public class CD extends Midia {

  private int NumMusicas;

  public CD() {
  }

  public CD(int cd, double pr, String nm, int musicas) {
    super(cd, pr, nm);
    this.NumMusicas = musicas;
  }

    public String toString() {
        return "CD{" + "NumMusicas=" + NumMusicas + '}';
    }
  
    public int getNumMusicas() {
    return NumMusicas;
  }

  public void setnMusicas(int nMusicas) {
    this.NumMusicas = nMusicas;
  }

  public String getTipo() {
    return "CD";
  }

  public String getDetalhes() {
    return "Nº de músicas " + NumMusicas;
  }

  public void inserirDados() {
    Scanner scan = new Scanner(System.in);
    System.out.printf("Nome do CD: ");
    this.setNome(scan.nextLine());
    System.out.printf("Código do CD: ");
    this.setCodigo(scan.nextInt());
    System.out.printf("preço do CD: ");
    this.setPreco(scan.nextDouble());
    System.out.printf("Número de músicas: ");
    NumMusicas = scan.nextInt();
  }

}
