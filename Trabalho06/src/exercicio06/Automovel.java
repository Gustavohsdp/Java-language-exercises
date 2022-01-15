package exercicio06;

public class Automovel extends Veiculo {

  private float OleoAtual;

  public Automovel() {
    velocidadeAtual = 0;
    OleoAtual = 0;
  }

  public Automovel(float velocidadeAtual, float qtdOleoAtual) {
    this.velocidadeAtual = velocidadeAtual;
    this.OleoAtual = qtdOleoAtual;
  }

  public float acelerar(float velocidade) {
    return velocidadeAtual += velocidade;
  }

  public void parar() {
    velocidadeAtual = 0;
  }

  public void trocarOleo(float litros) {
    OleoAtual += litros;
  }

  public float getVelocidadeAtual() {
    return velocidadeAtual;
  }

  public void setVelocidadeAtual(float velocidadeAtual) {
    this.velocidadeAtual = velocidadeAtual;
  }

  public float getOleoAtual() {
    return OleoAtual;
  }

  public void OleoAtual(float OleoAtual) {
    this.OleoAtual = OleoAtual;
  }
}