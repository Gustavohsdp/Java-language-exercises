package Exercicio1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class TesteSupermercado {

	public static void main(String[] args) {
		HashSet<Supermercado> hsc = new HashSet<Supermercado>();
		Scanner ler = new Scanner(System.in);

		hsc.add(new Supermercado("Sabão", 5, 00001));
		hsc.add(new Supermercado("Sabão", 10, 00002));
		hsc.add(new Supermercado("Biscoito", 5, 00003));
		hsc.add(new Supermercado("Banana", 5, 00003));

		System.out.println("Tamanho coleção HashSet: " + hsc.size());

		Iterator<Supermercado> it = hsc.iterator();
		while (it.hasNext()) {
			Supermercado valorCliente = (Supermercado) it.next();
			System.out.println(valorCliente);
		}
	}
}
