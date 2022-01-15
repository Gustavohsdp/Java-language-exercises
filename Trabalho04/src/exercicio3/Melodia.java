package exercicio3;

import exercicio2.Notas;
import java.util.*;

public class Melodia {

	ArrayList<Notas> NotasMusicais = new ArrayList<Notas>();
	ArrayList<Double> IntervaloTempo = new ArrayList<Double>();

	public ArrayList<Notas> getNotasMusicais() {
		return NotasMusicais;
	}

	public Melodia() {
	}

	public void setNotasMusicais(ArrayList<Notas> NotasMusicais) {
		this.NotasMusicais = NotasMusicais;
	}

	public ArrayList<Double> getIntervaloTempo() {
		return IntervaloTempo;
	}

	public void setIntervaloTempo(ArrayList<Double> IntervaloTempo) {
		this.IntervaloTempo = IntervaloTempo;
	}

	public Melodia(ArrayList<Notas> NotasMusicais, ArrayList<Double> IntervaloTempo) {
		this.IntervaloTempo = IntervaloTempo;
		this.NotasMusicais = NotasMusicais;
	}

	public void AdicionarTrechos(ArrayList<Notas> NotasMusicais) {
		this.NotasMusicais.addAll(NotasMusicais);
	}

	public void AdicionarMelodia(ArrayList<Notas> NotasMusicais, ArrayList<Double> IntervaloTempo) {
		this.NotasMusicais.addAll(NotasMusicais);
		this.IntervaloTempo.addAll(IntervaloTempo);
	}

	public void AdicionarNota(Notas NotasMusicais) {
		this.NotasMusicais.add(NotasMusicais);
	}

	public void TocarMelodia() {

		for (int i = 0; i <= NotasMusicais.size(); i++) {
			System.out.println("Nota: " + NotasMusicais.get(i));
			System.out.println("Intervalo: " + IntervaloTempo.get(i));
		}
	}

}
