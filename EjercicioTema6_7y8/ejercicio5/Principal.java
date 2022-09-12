package EjercicioTema6_7y8.ejercicio5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Principal {
  

  public static void main(String[] args){

    ArrayList<String> nombres = new ArrayList<String>();
    nombres.add("Agustin");
    nombres.add("Carlos");
    nombres.add("Karina");
    nombres.add("Eliana");

    LinkedList<String> nombresLinked = new LinkedList<String>(nombres);

    for(String nombre : nombres){
      System.out.println(nombre);
    }

    for(String nombre : nombresLinked){
      System.out.println(nombre);
    }
  }
}
