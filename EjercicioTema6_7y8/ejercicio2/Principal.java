package EjercicioTema6_7y8.ejercicio2;

public class Principal {
  
  public static void main(String[] args){
    
    int[][] numeros = {{1,9,6},{9,2,5}};

    for(int i = 0; i<numeros.length; i++){
      for(int j = 0; j<numeros[i].length; j++){
        System.out.println("Valor: " + numeros[i][j] + " posicion: " + i + "" +j);
      }
    }

    
  }
}
