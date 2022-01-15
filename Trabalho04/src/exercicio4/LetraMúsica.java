package exercicio4;

import java.util.ArrayList;
import exercicio5.Frase;

public class LetraMúsica {

	ArrayList<Frase> Letra = new ArrayList<Frase>();
	private Frase Refrão;

	public LetraMúsica(ArrayList<Frase> Frases) {
		this.Letra = Frases;
	}

	public Frase getPosiRefrão() {
		return Refrão;
	}

	public void setPosiRefrão(Frase PosiRefrão) {
		this.Refrão = PosiRefrão;
	}

	public ArrayList<Frase> getLetra() {
		return Letra;
	}

	public void InserirFrase(ArrayList<Frase> Letra) {
		this.Letra = Letra;
	}

	public void Bis(ArrayList<Frase> frase) {
		this.Letra.addAll(frase);
		this.Letra.addAll(frase);
	}

	public void DefinirRefrão(Frase letra) {

		for (int i = 0; i <= Letra.size(); i++) {

			if (Letra.get(i) == letra) {
				Refrão = Letra.get(i);
			}
		}
	}

	public void TocarMusica() {

		for (int i = 0; i <= Letra.size(); i++) {
			System.out.println(Letra.get(i));
			System.out.println(Letra.get(i).getIntervalo());
		}
	}

}
