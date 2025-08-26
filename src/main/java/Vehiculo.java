
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
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocidad + " km/h");
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
}
