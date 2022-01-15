package Exercicio10;

import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    Calculator calculadoraTeste = new Calculator();
    int opcao;
    double x;
    double y;

    System.out.println("Menu Principal");
    System.out.println("1 - Divis�o");
    System.out.println("2 - Log");

    System.out.println("Selecione uma opcao: ");
    opcao = ler.nextInt();

    switch (opcao) {
      case 1:
        System.out.println("Insira o valor de x: ");
        x = ler.nextDouble();
        System.out.println("Insira o valor de y: ");
        y = ler.nextDouble();
        System.out.println(calculadoraTeste.div(x, y));
        break;

      case 2:
        System.out.println("Insira o valor de x: ");
        x = ler.nextDouble();
        System.out.println(calculadoraTeste.log10(x));
        break;
    }
  }
}
