
public class VehiculoDeportivo {
    // Atributos privados
    private String marca;
    private double velocidad;
    private boolean turbo;
    
    // Constructor con parámetros
    public VehiculoDeportivo(String marca, double velocidad, boolean turbo) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.turbo = turbo;
    }
    
    // Getters
    public String getMarca() {
        return marca;
    }
    
    public double getVelocidad() {
        return velocidad;
    }
    
    public boolean isTurbo() {
        return turbo;
    }
    
    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
    
    // Método mostrarInfo()
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + " km/h, Turbo: " + (turbo ? "Sí" : "No"));
    }
    
    // Método mover()
    public void mover() {
        System.out.println("El vehículo deportivo acelera con turbo");
    }
}
