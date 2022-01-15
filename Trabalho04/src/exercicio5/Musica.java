package exercicio5;

import exercicio4.LetraMúsica;
import exercicio3.Melodia;

public class Musica {

	public LetraMúsica Letra;
	public Melodia Melod;

	public Musica(LetraMúsica Letra, Melodia Melod) {
		this.Letra = Letra;
		this.Melod = Melod;
	}

	public Musica() {

	}

	public LetraMúsica getLetra() {
		return Letra;
	}

	public void setLetra(LetraMúsica Letra) {
		this.Letra = Letra;
	}

	public Melodia getMelod() {
		return Melod;
	}

	public void setMelod(Melodia Melod) {
		this.Melod = Melod;
	}

	public void TocarMusica() {
		System.out.println("Musica{" + "Letra=" + Letra + ", Melodia=" + Melod + '}');
	}

}
