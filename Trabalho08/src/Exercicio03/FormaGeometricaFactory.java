package Exercicio03;

public class FormaGeometricaFactory {

  public FormasGeometricas getFormas(String nome) {

    if (nome.equals("Circulo"))
      return new Circulo(nome);
    if (nome.equals("Triangulo"))
      return new Triangulo(nome);
    if (nome.equals("Quadrado"))
      return new Quadrado(nome);
    return null;
  }
}
