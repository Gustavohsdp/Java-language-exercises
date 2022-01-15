package src.exercicio_02;

import java.util.Scanner;

public class Principal {

  public static void main(String[] argc) {

    Scanner entrada = new Scanner(System.in);
    JogoDaVelha partida = new JogoDaVelha();
    int jogador = 1;
    int vencedor = partida.confirmarJogadorVenc();

    partida.Exibir();

    while (vencedor == 0) {
      System.out.println("= = =");
      System.out.println("-*-*-*-*-*-*-Jogador = " + jogador + " -*-*-*-*-*-*-");

      System.out.print("Linha desejada: ");
      int linha = entrada.nextInt();

      System.out.print("Coluna desejada: ");
      int coluna = entrada.nextInt();

      if (!partida.realizarJogada(jogador, linha - 1, coluna - 1)) {
        System.out.println("= = =");
        System.out.println("Jogada inválida!!!");

      } else {

        jogador = (jogador == 1) ? 2 : 1;

      }

      partida.Exibir();
      vencedor = partida.confirmarJogadorVenc();

    }

    switch (vencedor) {
    case 1:
      System.out.println("= = =");
      System.out.println("================================================");
      System.out.println("========== JOGADOR 1 VENCEU A PARTIDA ==========");
      System.out.println("================================================");
      break;

    case 2:
      System.out.println("= = =");
      System.out.println("================================================");
      System.out.println("========== JOGADOR 2 VENCEU A PARTIDA ==========");
      System.out.println("================================================");
      break;

    case 3:
      System.out.println("= = =");
      System.out.println("======================================");
      System.out.println("========== PARTIDA EMPATADA ==========");
      System.out.println("======================================");
      break;
    }
  }

}
