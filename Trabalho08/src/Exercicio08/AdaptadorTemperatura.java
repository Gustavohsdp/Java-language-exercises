
package Exercicio08;

public class AdaptadorTemperatura implements MedidorCelsiusIF {

  private MedidorFarenheit temp;

  public AdaptadorTemperatura(MedidorFarenheit temp) {
    this.temp = temp;
  }

  public double medirTemperatura() {
    double temperatura = temp.getTemperaturaFarenheit();

    return ((temperatura - 32) / 1.8);
  }
}
