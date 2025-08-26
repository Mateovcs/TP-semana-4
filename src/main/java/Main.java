// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    // Crear una instancia de Vehiculo
    Vehiculo vehiculo1 = new Vehiculo("Toyota", 80.5);
    
    // Mostrar información usando mostrarInfo()
    vehiculo1.mostrarInfo();
    
    // Mostrar información usando toString()
    System.out.println(vehiculo1.toString());
    
    // Llamar al método mover()
    vehiculo1.mover();
    
    // Usar getters
    System.out.println("Marca obtenida con getter: " + vehiculo1.getMarca());
    System.out.println("Velocidad obtenida con getter: " + vehiculo1.getVelocidad());
    
    // Usar setters
    vehiculo1.setMarca("Honda");
    vehiculo1.setVelocidad(95.0);
    
    System.out.println("Después de usar setters:");
    vehiculo1.mostrarInfo();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}