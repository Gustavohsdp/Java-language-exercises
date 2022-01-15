package exercicio06;

public class Bicicleta extends Veiculo {

  public float acelerar(float velocidade) {
    return velocidadeAtual += velocidade;
  }

  public void parar() {
    velocidadeAtual = 0;
  }
}