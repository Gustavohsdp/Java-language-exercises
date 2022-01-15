package exercicio06;

public abstract class Veiculo {

  protected float velocidadeAtual;

  abstract public void parar();

  abstract public float acelerar(float velocidade);
}