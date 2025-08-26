
public class Vehiculo {
    // Atributos privados
    private String marca;
    private double velocidad;
    
    // Constructor con parámetros
    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }
    
    // Getters
    public String getMarca() {
        return marca;
    }
    
    public double getVelocidad() {
        return velocidad;
    }
    
    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    // Método mostrarInfo()
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + " km/h");
    }
    
    // Sobreescribir toString()
    @Override
    public String toString() {
        return "Vehiculo{marca='" + marca + "', velocidad=" + velocidad + " km/h}";
    }
    
    // Método mover()
    public void mover() {
        System.out.println("El vehículo se está moviendo");
    }
    
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
}
