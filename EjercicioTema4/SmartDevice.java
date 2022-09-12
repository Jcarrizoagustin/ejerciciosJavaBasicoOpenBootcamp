package EjercicioTema4;

public class SmartDevice {
  
  private String marca;
  private String modelo;
  private String color;
  private String duracionBateria;
  private String tamanioPantalla;

  private double precio;

  public SmartDevice(){

  }

  public SmartDevice(String marca, String modelo,String color, String duracionBateria, String tamanioPantalla, double precio){
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.duracionBateria = duracionBateria;
    this.tamanioPantalla = tamanioPantalla;
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Modelo: " + this.modelo + " " + ", marca: " + this.marca;
  }
}

