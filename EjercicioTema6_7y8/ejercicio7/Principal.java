package EjercicioTema6_7y8.ejercicio7;

public class Principal {
  

  

  public static void dividePorCero(int num1, int num2) throws ArithmeticException{
    if(num2 == 0){
      throw new ArithmeticException();
    }else{
      System.out.println(num1/num2);
    }
  }
}
