package EjercicioTema6_7y8.ejercicio7;

public class Main {
  
  public static void main(String[] args){
    try {
      Principal.dividePorCero(2, 0);
    }catch(ArithmeticException e){
      System.out.println("Esto no puede hacerse");
    }finally{
      System.out.println("Demo de codigo");
    }
  }
}
