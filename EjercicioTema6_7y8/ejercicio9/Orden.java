package EjercicioTema6_7y8.ejercicio9;

import java.util.HashMap;
import java.util.Map;

public class Orden {
  
  /*
   * Esta clase contendra un pedido en un hashmap donde la clave sera el producto y el valor sera la cantidad
   */
  
  private HashMap<Producto, Integer> orden = new HashMap<Producto, Integer>();
  private double total;


  public void agregarProductoALaOrden(Producto producto, Integer cantidad){
    try{
      this.orden.put(producto, cantidad);
    }catch(Exception e){
      System.out.println("Ocurrio un error: " + e.getMessage());
    }
  }

  public double calcularTotal(){
    double total = 0;
    for(Map.Entry<Producto,Integer> valores : this.orden.entrySet()){
      total += valores.getValue() * valores.getKey().getPrecio();
    }
    return total;
  }

  public double getTotal() {
    return total;
  }
}
