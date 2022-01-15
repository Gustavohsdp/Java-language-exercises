//Criar um algoritmo que carregue uma matriz 12 × 4 com os valores das vendas de uma
//loja, em que cada linha represente um mˆes do ano, e cada coluna, uma semana do mˆes. Para simplificar,
//considere que cada mˆes possui somente 4 semanas. Calcule e imprima:
//a) Total vendido em cada mˆes do ano;
//(b) Total vendido em cada semana durante todo o ano
//(c) Total vendido no ano.

package main;

import java.util.Scanner;

public class Exercicio_04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] matriz = new int[12][4];
    int totalAno = 0, vendasMes = 0;
    int linha, coluna;

    for (linha = 0; linha < 12; linha++) {
      System.out.println("Informe as vendas do mês: " + (linha + 1));
      for (coluna = 0; coluna < 4; coluna++) {
        System.out.println("semana: " + (coluna + 1));
        matriz[linha][coluna] = scanner.nextInt();
      }
    }

    for (linha = 0; linha < 12; linha++) {
      vendasMes = 0;
      System.out.println("\nMes: " + (linha + 1));
      for (coluna = 0; coluna < 4; coluna++) {
        System.out.println("Total vendido na " + (coluna + 1) + " semana" + ":" + matriz[linha][coluna]);
        vendasMes += matriz[linha][coluna];
        totalAno += matriz[linha][coluna];
      }
      System.out.println("\nTotal vendido no mês: " + vendasMes);
    }
    System.out.println("\n\nTotal vendido no ano: " + totalAno);
  }
}