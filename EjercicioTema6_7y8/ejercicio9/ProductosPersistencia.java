package EjercicioTema6_7y8.ejercicio9;



import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ProductosPersistencia {

  public static void guardar(Producto producto){
    String directorio = "D:\\Projects\\java\\ejerciciosJavaBasicoOpenBootcamp\\EjercicioTema6_7y8\\ejercicio9\\productos.txt";
    try{
      PrintStream archivo = new PrintStream(directorio);
      archivo.write(producto.toString().getBytes());
      archivo.close();
    }catch(Exception e){
      System.out.println("Ocurrio un error: " + e.getMessage());
    }
  }

  public static void listar(){
    String directorio = "D:\\Projects\\java\\ejerciciosJavaBasicoOpenBootcamp\\EjercicioTema6_7y8\\ejercicio9\\productos.txt";
    try{
      InputStream archivo = new FileInputStream(directorio);
      byte[] datos =  archivo.readAllBytes();
      for(byte dato : datos){
        System.out.print((char)dato);
      }
      archivo.close();
    }catch(Exception e){
      System.out.println("Ocurrio un error: " + e.getMessage());
    }
  }



}
