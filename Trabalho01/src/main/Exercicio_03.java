//Escreva uma fun¸c˜ao recursiva que calcule a sequencia dada por:
//F(1) = 1 (1)
//F(2) = 2 (2)
//F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2) (3)

package main;

import java.util.Scanner;

public class Exercicio_03 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Entre com um número para ser adicionado na função recursiva: ");
    int number = scanner.nextInt();

    int result = fatorialRecursivo(number);

    System.out.println("O resultado da função recursiva é: " + result);
  }

  public static int fatorialRecursivo(int number) {

    if (number == 1) {
      return 1;
    } else if (number == 2) {
      return 2;
    } else {
      return 2 * fatorialRecursivo(number - 1) + 3 * fatorialRecursivo(number - 2);
    }
  }
}
