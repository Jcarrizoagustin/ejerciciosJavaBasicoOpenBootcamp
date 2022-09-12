package EjercicioTema5;

public class CocheCRUDImpl implements CocheCRUD{
  

  @Override
  public void save(){
    System.out.println("Metodo save");
  }

  @Override
  public void findAll(){
    System.out.println("Metodo findAll");
  }

  @Override
  public void delete(){
    System.out.println("Metodo delete");
  }

  @Override
  public String toString(){
    return "Clase CocheCRUDImpl que implementa la interfaz CocheCRUD";
  }
}
