package exercicio5;

public class Frase {

	private String palavras;
	private double Intervalo = 0;

	public Frase(String palavras, double interv) {
		this.palavras = palavras;
		this.Intervalo = interv;
	}

	public String getPalavras() {
		return palavras;
	}

	public void setPalavras(String palavras) {
		this.palavras = palavras;
	}

	public double getIntervalo() {
		return Intervalo;
	}

	public void setIntervalo(double Intervalo) {
		this.Intervalo = Intervalo;
	}

}
