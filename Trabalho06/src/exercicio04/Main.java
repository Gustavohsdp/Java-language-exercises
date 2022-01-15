package exercicio04;

public class Main {

  public static void main(String[] args) {

    Midia cd = new CD();
    // Realizando cadastro do CD
    cd.inserirDados();
    // Imprimindo CD
    cd.printDados();
    DVD dvd = new DVD();
    // Realizando cadastro do DVD
    dvd.inserirDados();
    // Imprimindo DVD
    dvd.printDados();
  }
}
