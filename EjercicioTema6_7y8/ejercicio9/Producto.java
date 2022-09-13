package EjercicioTema6_7y8.ejercicio9;

public class Producto {
  
  private String nombre;
  private double precio;

  public Producto(String nombre, double precio){
    this.nombre = nombre;
    this.precio = precio;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }

  @Override
  public String toString(){
    return this.nombre;
  }
}
