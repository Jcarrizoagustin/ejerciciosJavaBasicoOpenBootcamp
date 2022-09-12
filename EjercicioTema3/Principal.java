package EjercicioTema3;
public class Principal {



  public static void main(String[] args){


    String[] palabras = {"Hola", "amigos", "de", "OpenBootcamp"};

    String resultado = "";

    for(String palabra : palabras){
      resultado += palabra + " ";
    }

    System.out.println(resultado);
  }
}