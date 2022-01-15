package exercicio2;

public class Gerente extends Empregado {
  private String nomeGerencia;

  public Gerente(String nome) {
    super(nome);
  }

  public String getNomeGerencia() {
    return this.nomeGerencia;
  }

  public void setNomeGerencia(String nomeGerencia) {
    this.nomeGerencia = nomeGerencia;
  }

  public String toString() {
    return "Name: " + this.getNome() + "\n" + "Idade: " + this.getIdade() + "\n" + "Matricula: " + this.getMatricula()
        + "\n"
        + "Nome da gerencia: " + this.getNomeGerencia() + "\n" + "Valor do INSS do gerente: " + this.valorInss();
  }
}
