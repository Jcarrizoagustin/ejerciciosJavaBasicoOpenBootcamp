package EjercicioTema4;

public class SmartPhone extends SmartDevice{
  private String sistemaOperativo;
  private boolean compatibleCon5G;
  private int memoriaRam;
  private int almacenamiento;

  public SmartPhone(){

  }

  public SmartPhone(String marca, String modelo,String color, String duracionBateria, String tamanioPantalla, double precio, String sistema, boolean compatibilidad, int memoria, int almacenamiento){
    super(marca, modelo, color, duracionBateria, tamanioPantalla, precio);
    this.sistemaOperativo = sistema;
    this.compatibleCon5G = compatibilidad;
    this.memoriaRam = memoria;
    this.almacenamiento = almacenamiento;

  }

  @Override
  public String toString() {
    
    return super.toString() + ", sistemaOperativo: " + this.sistemaOperativo;
  }
}
