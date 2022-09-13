package EjercicioTema6_7y8.ejercicio8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Principal {
  
  public static void copiarFichero(String fileIn, String fileOut){
    

    try{
      InputStream archivoACopiar = new FileInputStream(fileIn);
      byte[] datos = archivoACopiar.readAllBytes();
      archivoACopiar.close();

      PrintStream archivoCopiado = new PrintStream(fileOut);
      archivoCopiado.write(datos);
      archivoCopiado.close();
    }catch(FileNotFoundException e){
      System.out.println("Error: " + e.getMessage());
    }catch(IOException e){
      System.out.println("Error: " + e.getMessage());
    }catch(Exception e){
      System.out.println("Error: " + e.getMessage());
    }
    
  }

  public static void main(String[] args){
    String archivo1 = "D:\\Projects\\java\\ejerciciosJavaBasicoOpenBootcamp\\EjercicioTema6_7y8\\ejercicio8\\archivoACopiar.txt";
    String archivo2 = "D:\\Projects\\java\\ejerciciosJavaBasicoOpenBootcamp\\EjercicioTema6_7y8\\ejercicio8\\archivoCopiado.txt";
    Principal.copiarFichero(archivo1, archivo2);

  }
}
