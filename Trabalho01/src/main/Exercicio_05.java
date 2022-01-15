//Criar um algoritmo que entre com valores inteiros para uma matriz m3×3 e imprima a
//matriz final, conforme mostrado a seguir

//Mostrar a matriz original e depois rotaciona-la em 90°

package main;

import java.util.Scanner;

public class Exercicio_05 {
  public static void main(String[] args) {
    int[][] matriz = new int[3][3];

    Scanner scanner = new Scanner(System.in);

    // Entrada dos dados por parte do usúario;
    for (int linha = 0; linha < 3; linha++) {
      for (int coluna = 0; coluna < 3; coluna++) {
        System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1, coluna + 1);
        matriz[linha][coluna] = scanner.nextInt();
      }
    }

    // Imprimindo a matriz montada;
    System.out.println("Matriz montada: ");
    for (int linha = 0; linha < 3; linha++) {
      for (int coluna = 0; coluna < 3; coluna++) {
        System.out.printf("\t %d \t", matriz[linha][coluna]);
      }
      System.out.println();
    }

    // Imprimindo a matriz em 90°;
    System.out.println("Matriz girada em 90°");
    int largura = matriz.length;
    for (int linha = 0; linha < 3; linha++) {
      for (int coluna = 0; coluna < 3; coluna++) {
        System.out.printf("\t %d \t", matriz[largura - coluna - 1][linha]);
      }
      System.out.println();
    }
  }
}