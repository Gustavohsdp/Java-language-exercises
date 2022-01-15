package Exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Numeros {

  public static void main(String[] args) {

    ArrayList<Integer> numero = new ArrayList<>();

    Random l = new Random();

    int maior;
    int menor;
    int repeticaoMaior = 0;
    int repeticaoMenor = 0;

    for (int a = 1; a < 50; a++) {
      int k = l.nextInt(89) + 10;
      numero.add(k);
    }
    // Maior
    maior = Collections.max(numero);

    // Menor
    menor = Collections.min(numero);

    // Ordenar
    Collections.sort(numero);

    // Repetição do maior e menor
    repeticaoMaior = Collections.frequency(numero, maior);
    repeticaoMenor = Collections.frequency(numero, menor);

    for (int m = 0; m < 49; m++) {
      System.out.println("Número: " + numero.get(m));
    }

    System.out.println("O maior número sorteado é: " + maior);
    System.out.println("O menor número sorteado é: " + menor);
    System.out.println("Repetição do maior número: " + repeticaoMaior);
    System.out.println("Repetição do menor número: " + repeticaoMenor);
  }
}
