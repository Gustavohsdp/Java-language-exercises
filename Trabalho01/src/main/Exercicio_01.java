// A gerente do cabeleireiro Sempre Bela tem uma tabela em que registra os
//”pes”, as ”maos e o servi¸co de podologia das cinco manicures. Sabendo-se que cada uma ganha 50% do
//que faturou ao mes, criar um algoritmo que possa calcular e imprimir quanto cada um vai receber, uma
//vez que nao tem carteiras

package main;

import java.util.Scanner;

public class Exercicio_01 {
  public static void main(String[] args) {

    int count = 0;
    float manicures = 5;
    float valor_final;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual o valor do serviços dos pés? ");
    int valorPes = scanner.nextInt();
    System.out.println("Informe o valor do serviços das mãos? ");
    int maos = scanner.nextInt();
    System.out.println("Informe o valor dos serviços de podologia?");
    int podologia = scanner.nextInt();

    while (count < manicures) {
      System.out.println("Quantos serviços de pés foi realizado no mês?");
      int servicosPes = scanner.nextInt();

      System.out.println("Quantos serviços de mãos foi realizado no mês?");
      int servicosMaos = scanner.nextInt();

      System.out.println("Quantos serviços de podologia foi realizado no mês?");
      int servicosPodologia = scanner.nextInt();

      valor_final = ((valorPes * servicosPes) + (maos * servicosMaos) + (podologia * servicosPodologia)) / 2;

      System.out.println("Manicure o seu salario neste mês será: " + valor_final + " correspondente a 50%");
      count++;
    }
  }
}