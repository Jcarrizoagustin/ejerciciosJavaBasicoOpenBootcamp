package EjercicioTema4;

public class SmartWatch extends SmartDevice{
  private String colorMalla;
  private boolean tieneMonitorDeSuenio;

  public SmartWatch(){

  }

  public SmartWatch(String marca, String modelo,String color, String duracionBateria, String tamanioPantalla, double precio, String colorMalla, boolean monitorSuenio){
    super(marca, modelo, color, duracionBateria, tamanioPantalla, precio);
    this.colorMalla = colorMalla;
    this.tieneMonitorDeSuenio = monitorSuenio;

  }

  @Override
  public String toString() {
    
    return "SmartWatch: " + super.toString() + ", colorMalla: " + this.colorMalla;
  }
}
