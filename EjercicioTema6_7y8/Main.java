package EjercicioTema6_7y8;

public class Main {
  
  public static String reverse(String texto) { 
    String resultado = "";
    for(int i = texto.length()-1; i>=0;i--){
      resultado += texto.charAt(i);
    }
    return resultado;
  }

  public static void main(String[] args){
    System.out.println(Main.reverse("Hola mundo"));
  }

}
