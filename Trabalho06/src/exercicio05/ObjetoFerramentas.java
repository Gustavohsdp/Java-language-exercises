package exercicio05;

public class ObjetoFerramentas implements Ferramentas {

  public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
    Animal animaisFiltrados[];

    int i = 0;
    for (Animal animal : completo) {
      if (animal.getNomeEspecie().equalsIgnoreCase(especieFiltrar)) {
        i++;
      }
    }

    animaisFiltrados = new Animal[i];
    i = 0;

    for (Animal animal : completo) {

      if (animal.getNomeEspecie().equalsIgnoreCase(especieFiltrar)) {
        animaisFiltrados[i] = animal;

        i++;

      }
    }
    return animaisFiltrados;
  }

  public String[] classificaEspecies(Animal[] completo) {

    String especies[] = new String[completo.length];
    especies[0] = completo[0].getNomeEspecie();

    int i = 1;

    for (Animal animal : completo) {

      if (!animal.getNomeEspecie().equalsIgnoreCase(especies[i - 1])) {
        especies[i] = animal.getNomeEspecie();
        i++;

      }
    }

    return especies;

  }

  public Resultado[] getResultados(ObjetoAnimal[] animais, ObjetoFerramentas ferramenta) {

    String especies[] = ferramenta.classificaEspecies(animais);
    Resultado resultados[] = new Resultado[especies.length];
    int j = 0;

    for (String especie : especies) {
      resultados[j] = new Resultado(especie, ferramenta.filtraEspecie(animais, especie).length);
      j++;
    }

    return resultados;
  }

}