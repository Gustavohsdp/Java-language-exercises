package src.exercicio_02;

import java.util.Scanner;

public class JogoDaVelha {

  private int[][] Partida = new int[3][3];

  public JogoDaVelha() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        Partida[i][j] = 0;
      }
    }
  }

  public int confirmarJogadorVenc() {

    for (int i = 0; i < 3; i++) {
      if ((Partida[i][0] == Partida[i][1]) && (Partida[i][0] == Partida[i][2])) {

        if (Partida[i][0] != 0) {

          return Partida[i][0];
        }
      }
    }

    for (int j = 0; j < 3; j++) {
      if ((Partida[0][j] == Partida[1][j]) && (Partida[0][j] == Partida[2][j]) && (Partida[0][j] != 0)) {

        return Partida[0][j];
      }
    }

    if ((Partida[0][0] == Partida[1][1]) && (Partida[0][0] == Partida[2][2]) && (Partida[0][0] != 0)) {

      return Partida[0][0];
    }

    if ((Partida[0][2] == Partida[1][1]) && (Partida[0][2] == Partida[2][0]) && (Partida[0][2] != 0)) {

      return Partida[0][2];
    }

    for (int i = 0; i < 3; i++) {

      for (int j = 0; j < 3; j++) {

        if (Partida[i][j] == 0) {

          return 0;
        }
      }
    }

    return 3;
  }

  public boolean realizarJogada(int jogador, int linha, int coluna) {

    if ((linha < 0) || (linha > 2)) {

      return false;
    }
    if ((coluna < 0) || (coluna > 2)) {

      return false;
    }
    if (Partida[linha][coluna] != 0) {

      return false;
    }

    Partida[linha][coluna] = jogador;
    return true;
  }

  public void Exibir() {

    System.out.println("= = =");

    for (int i = 0; i < 3; i++) {

      for (int j = 0; j < 3; j++) {

        System.out.print(Partida[i][j] + " ");

      }

      System.out.println();

    }
  }

}
