package exercicio2;

public class Pessoa {
  private String nome;
  private int idade;
  private String sexo;

  public Pessoa(String nomeDigitado) {
    this.nome = nomeDigitado;
  }

  public void setNome(String valorDoInput) {
    this.nome = valorDoInput;
  }

  public String getNome() {
    return this.nome;
  }

  public void setIdade(int valorDoInput) {
    this.idade = valorDoInput;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setSexo(String valorDoInput) {
    this.sexo = valorDoInput;
  }

  public String getSexo() {
    return this.sexo;
  }
}
