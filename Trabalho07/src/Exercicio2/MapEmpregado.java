package Exercicio2;

import java.util.HashMap;
import java.util.Map;

public class MapEmpregado {

  public static void main(String[] args) {

    Map<String, String> Empregados = new HashMap<String, String>();

    Empregados.put("a1234", new String("Steve Jobs"));
    Empregados.put("a1235", new String("Scott McNealy"));
    Empregados.put("a1236", new String("Jeff Bezos"));
    Empregados.put("a1237", new String("Larry Ellison"));
    Empregados.put("a1238", new String("Bill Gates"));

    // PERCORRENDO TODO O MAP
    for (String key : Empregados.keySet()) {
      String value = Empregados.get(key);
      System.out.println(key + " = " + value);
    }

    String RecuperarFuncionarioIncorreto = "a1111";

    String value2 = Empregados.get(RecuperarFuncionarioIncorreto);
    System.out.println(RecuperarFuncionarioIncorreto + " = " + value2);

  }
}
