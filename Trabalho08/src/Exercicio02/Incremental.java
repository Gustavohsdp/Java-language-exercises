package Exercicio02;

public class Incremental {

  private static Incremental instance = new Incremental();

  private static int count = 0;
  private static int numero;

  private Incremental() {
    numero = ++count;
  }

  public static Incremental getInstance() {

    if (instance == null) {

      synchronized (Incremental.class) {

        if (instance == null) {

          instance = new Incremental();
        }
      }
    }

    return instance;
  }

}
