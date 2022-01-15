package exercicio6;

import exercicio5.Frase;
import exercicio5.Musica;
import exercicio4.LetraMúsica;
import exercicio3.Melodia;
import exercicio2.Notas;
import java.util.ArrayList;
import java.util.Collection;

public class EditorMusica {

	public static void main(String[] arcs) {

		try {
			ArrayList<Notas> nt1 = new ArrayList((Collection) new Notas("Musica", 10));
			ArrayList<Double> list = new ArrayList<Double>(10);

			Melodia m1 = new Melodia(nt1, list);
			ArrayList<Frase> Letr = new ArrayList((Collection) new Frase("Musica", 10));

			LetraMúsica letra1 = new LetraMúsica(Letr);

			Musica ms = new Musica(letra1, m1);
			ms.TocarMusica();
		} catch (Exception ex) {
		}
	}
}
