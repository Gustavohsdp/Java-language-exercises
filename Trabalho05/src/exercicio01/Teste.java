package exercicio01;

public class Teste {

  public static void main(String[] args) {
    System.out.println("Cachorro");
    Cachorro testeCachorro = new Cachorro("Sansão");
    testeCachorro.setPeso(3.600);
    testeCachorro.setRaca("Husky siberiano");
    System.out.println(testeCachorro + "\n");

    System.out.println("Peixe");
    Peixe testePeixe = new Peixe(" Peixe tetra neon");
    testePeixe.setPeso(0.055);
    testePeixe.setTipoHabitat("Agua doce");
    System.out.println(testePeixe);
  }
}
