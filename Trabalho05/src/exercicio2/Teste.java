package exercicio2;

public class Teste {
  public static void main(String[] args) {
    System.out.println("Cliente");
    Cliente testeCliente = new Cliente("Gustavo Henrique");
    testeCliente.setGetValorDivida(550);
    testeCliente.setIdade(20);
    testeCliente.setSexo("Masculino");
    testeCliente.setAnoNascim(2001);
    System.out.println(testeCliente + "\n");

    System.out.println("Vendedor");
    Vendedor testeVendedor = new Vendedor("Vanessa");
    testeVendedor.setSalario(2000);
    testeVendedor.setValorVendas(45612);
    testeVendedor.setQntVendas(121);
    System.out.println(testeVendedor + "\n");

    System.out.println("Gerente");
    Gerente testeGerente = new Gerente("Ana Clara");
    testeGerente.setSalario(2300);
    testeGerente.setIdade(22);
    testeGerente.setMatricula("214A457");
    testeGerente.setNomeGerencia("Desenvolvedor");
    System.out.println(testeGerente + "\n");
  }
}
