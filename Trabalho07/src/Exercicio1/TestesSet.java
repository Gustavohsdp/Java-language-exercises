package Exercicio1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class TestesSet {

	public static void main(String[] args) {

		int n;
		Scanner ler = new Scanner(System.in);
		HashSet<Nome> hsc = new HashSet<Nome>();

		hsc.add(new Nome("Ana Paula"));
		hsc.add(new Nome("Barbara Silva"));
		hsc.add(new Nome("Barbara Silva"));
		hsc.add(new Nome("Carla Souza"));
		hsc.add(new Nome("Carla Souza"));

		System.out.println("===================================");
		System.out.println("===================================");
		System.out.println("1 - Inserir nome");
		System.out.println("2 - Remover nome");
		System.out.println("3 - Consultar nome");
		System.out.println("4 - Apagar todos os nomes");
		System.out.println("5 - Sair");
		System.out.println("===================================");
		System.out.println("Informe a opção desejada: ");
		n = ler.nextInt();

		switch (n) {
			case 1:
				System.out.println("Insira o nome:");
				String Nome;
				Nome = ler.next();
				hsc.add(new Nome(Nome));
				System.out.println("Nome inserido com sucesso!!!");
				break;

			case 2:
				System.out.println("Insira o nome que deseja remover:");
				String NomeRemover;
				NomeRemover = ler.next();
				if (hsc.isEmpty() == true) {
					System.out.println("HashSet está vazio!!!");
				} else {
					for (Iterator<Nome> it = hsc.iterator(); it.hasNext();) {
						Nome t = it.next();
						if (t.equals(NomeRemover))
							it.remove();
					}
					System.out.println("Nome removido com sucesso!!!");
				}
				break;

			case 3:
				System.out.println("Insira o nome que deseja consultar:");
				String consulta;
				consulta = ler.next();

				if (hsc.contains(consulta)) {
					System.out.println("O nome" + consulta + " já existe no HashSet!");
				}
				break;

			case 4:
				hsc.removeAll(hsc);
				System.out.println("Todos os nomes foram apagados!!!");
				System.out.println("Tamanho HashSet: " + hsc.size());
				break;

			case 5:
				break;

		}
		System.out.println("Tamanho HashSet: " + hsc.size());
		Iterator<Nome> it = hsc.iterator();
		while (it.hasNext()) {
			Nome valorCliente = (Nome) it.next();
			System.out.println(valorCliente);
		}
	}
}
