public class Principal {

  public static float calcularPrecio(float precioBase){
    return precioBase * 1.21f; 
  }

  public static void main(String[] args){


    float precioFinal = Principal.calcularPrecio(50f);
    System.out.println(precioFinal);

  }
}