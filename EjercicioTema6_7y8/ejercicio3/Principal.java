package EjercicioTema6_7y8.ejercicio3;

import java.util.Vector;

public class Principal {
  

  public static void main(String[] args){
    
    Vector<Integer> numeros = new Vector<>();

    numeros.add(2);
    numeros.add(4);
    numeros.add(6);
    numeros.add(8);
    numeros.add(10);

    System.out.println(numeros);

    numeros.remove(1);
    numeros.remove(2);

    System.out.println(numeros);

    //Respuesta al ejercicio N4
    /*
     * El problema de utilizar un vector con la capacidad por defecto y tener que rellenarlo, por ejemplo, con 1000 elementos, es el costo de operacion
     * computacional que ello requeriria, ya que al superar o desbordar la capacidad por defecto de tal vector (que es de 10) este se redimensiona haciendo una copia
     * de todos los valores ya introducidos previamente.
     */
  }
}
