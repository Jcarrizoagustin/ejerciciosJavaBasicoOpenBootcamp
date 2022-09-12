package EjercicioTema6_7y8.ejercicio6;

import java.util.ArrayList;

public class Principal {
  

  public static void main(String[] args){


    ArrayList<Integer> numeros = new ArrayList<>();
    
    //Relleno con numeros del 1  al 10
    for(int i = 1; i<=10; i++){
      numeros.add(i);
    }
    
    System.out.println(numeros);
    
    for(int i = 0; i< numeros.size(); i++){
      if(numeros.get(i) % 2 == 0){
        numeros.remove(i);
      }
    }

    System.out.println(numeros);
  }
}
