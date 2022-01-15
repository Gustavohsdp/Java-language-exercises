package exercicio1;

import java.util.ArrayList;

public class Poligono {

  ArrayList<Pontos> ConjuntoDePontos = new ArrayList<Pontos>();

  public Poligono() {
  }

  public ArrayList<Pontos> getIntervaloTempo() {
    return ConjuntoDePontos;
  }

  public void setIntervaloTempo(ArrayList<Pontos> IntervaloTempo) {
    this.ConjuntoDePontos = IntervaloTempo;
  }

  public void AdicionarPonto(Pontos ponto) {
    boolean verificar;

    if (ConjuntoDePontos.size() != 0) {

      for (int i = 0; i < ConjuntoDePontos.size(); i++) {

        verificar = ponto.equals(ConjuntoDePontos.get(i));

        if (verificar != true) {
          ConjuntoDePontos.add(ponto);
        } else {
          System.out.println("Ponto já existente no polígono!");
        }
      }

    } else {
      ConjuntoDePontos.add(ponto);
    }

  }

  public void RemoverPonto(Pontos ponto) {
    if (ConjuntoDePontos.size() != 0) {
      ConjuntoDePontos.remove(ponto);
    } else {
      System.out.println("Conjunto de Pontos vazio!");
    }
  }

  public String toString() {
    return "Poligono{" + "ConjuntoDePontos=" + ConjuntoDePontos + '}';
  }

}
