package EjercicioTema4;

public class Main {
  


  public static void main(String[] args){

    SmartDevice reloj = new SmartWatch("Imilab", "w01","negro","14 dias", "1.65 pul.", 12.999, "blanca", true);

    SmartDevice celular = new SmartPhone("Xiaomi", "Redmi 10", "Gray", "2 dias", "6.5 pul.", 30.000, "Android ", true, 4, 128, "50MP");

    System.out.println(reloj);
    System.out.println(celular);
  }
}
