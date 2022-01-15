package exercicio2;

public class Notas {

	private String Nota;
	private double Tempo;
	private String Modificador = "";

	public Notas(String nota, double tempo) {
		this.Tempo = tempo;
		this.Nota = nota;
	}

	public Notas() {
	}

	public String getNota() {
		return Nota;
	}

	public double getTempo() {
		return Tempo;
	}

	public void setNota(String nota) {
		this.Nota = nota;
	}

	public void setTempo(double tempo) {
		this.Tempo = tempo;
	}

	public void modificarNota(String modificador) {
		this.Modificador = modificador;
	}

	public void TocarNota() {
		System.out.println("Nota: " + Nota);
		if (Modificador != "") {
			System.out.println("Modificador: " + Modificador);
		}
		System.out.println("Tempo: " + Tempo);
	}

}
