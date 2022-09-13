package EjercicioTema6_7y8.ejercicio9;

public class Main {
  


  public static void main(String[] args){


    //Producto producto = new Producto("Celular", 20.000);
    Producto producto = new Producto("SmarTV", 20.000);
    ProductosPersistencia.guardar(producto);
    ProductosPersistencia.listar();
  }
}
