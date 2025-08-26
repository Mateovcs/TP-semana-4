
public class Main {
    public static void main(String[] args) {
        System.out.println("Probando Vehiculo");
        
        // Crear instancia de Vehiculo
        Vehiculo vehiculo = new Vehiculo("Ford", 120.0);
        
        // Probar mostrarInfo() y mover()
        vehiculo.mostrarInfo();
        vehiculo.mover();
        
        System.out.println("\n--- Probando VehiculoDeportivo ---");
        
        // Crear instancia de VehiculoDeportivo
        VehiculoDeportivo deportivo = new VehiculoDeportivo("Ferrari", 250.0, true);
        
        // Probar mostrarInfo() y mover()
        deportivo.mostrarInfo();
        deportivo.mover();
        
        System.out.println("\n--- Probando getters y setters--- ");
        
        // Probar getters
        System.out.println("Vehículo - Marca: " + vehiculo.getMarca() + ", Velocidad: " + vehiculo.getVelocidad());
        System.out.println("Deportivo - Marca: " + deportivo.getMarca() + ", Turbo: " + deportivo.isTurbo());
        
        // Probar setters
        vehiculo.setMarca("Chevrolet");
        vehiculo.setVelocidad(140.0);
        deportivo.setTurbo(false);
        
        System.out.println("\n--- Después de usar setters--- :");
        vehiculo.mostrarInfo();
        deportivo.mostrarInfo();
    }
}
