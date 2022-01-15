//Uma floricultura conhecedora de sua clientela gostaria de fazer um algoritmo que
//pudesse controlar sempre um estoque m´ınimo de determinadas plantas, pois todo dias, pela manh˜a, o
//dono faz novas aquisi¸c˜oes. Criar um algoritmo que deixe cadastrar 50 tipos de plantas e nunca deixar
//o estoque ficar abaixo do ideal. Para cada planta, o dono gostaria de cadastrar o nome, o estoque ideal
//e a quantidade em estoque. Dessa forma o algoritmo pode calcular a quantidade que o dono da loja
//precisa comprar no pr´oximo dia. Essa quantidade a ser comprada deve ser impressa (quando maior que
//zero) como uma lista para o dono da floricultura.

package main;

import java.util.Scanner;

public class Exercicio_02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Declaração da variaveis e vetores
    String planta[] = new String[50];
    int estoqueIdeal[] = new int[50];
    int quantidadeEmEstoque[] = new int[50];

    int proximaCompra;
    int count = 0;

    // Capturando os dados inserido pelo usuario e realizando o calculo para o
    // retorno esperado;
    while (count < planta.length) {
      System.out.println("Informe o nome das plantas: ");
      planta[count] = scanner.nextLine();

      System.out.println("Informe o estoque ideal: ");
      estoqueIdeal[count] = scanner.nextInt();

      System.out.println("Informe a quantidade em estoque: ");
      quantidadeEmEstoque[count] = scanner.nextInt();

      proximaCompra = estoqueIdeal[count] - quantidadeEmEstoque[count];
      System.out.println("Precisa comprar no proximo dia " + proximaCompra + " plantas");
      scanner.nextLine();
      count++;
    }
  }
}