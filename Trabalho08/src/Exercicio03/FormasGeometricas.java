
package Exercicio03;

public interface FormasGeometricas {

  public void desenhar();

}

class Circulo implements FormasGeometricas {

  private String nome;

  public Circulo(String nome) {
    this.nome = nome;
    desenhar();
  }

  public void desenhar() {
    System.out.println("Nome da forma geométrica: " + this.nome);
  }

}

class Triangulo implements FormasGeometricas {

  private String nome;

  public Triangulo(String nome) {
    this.nome = nome;
    desenhar();
  }

  public void desenhar() {
    System.out.println("Nome da forma geométrica: " + this.nome);
  }
}

class Quadrado implements FormasGeometricas {

  private String nome;

  public Quadrado(String nome) {
    this.nome = nome;
    desenhar();
  }

  public void desenhar() {
    System.out.println("Nome da forma geométrica: " + this.nome);
  }
}
