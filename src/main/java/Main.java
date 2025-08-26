public class Main {
    public static void main(String[] args) {
        
        Libro libro = new Libro();
        libro.setTitulo("El Quijote");
        libro.setAutor("Miguel de Cervantes");

        Revista revista = new Revista();
        revista.setTitulo("National Geographic");
        revista.setEditor("National Geographic Society");

        System.out.println("=== INFORMACIÓN DEL LIBRO ===");
        libro.mostrarInfo();
        
        System.out.println("\n=== INFORMACIÓN DE LA REVISTA ===");
        revista.mostrarInfo();

        System.out.println("\n=== PROBANDO MÉTODO LEER ===");
        libro.leer();
        revista.leer();

        Object[] publicaciones = {libro, revista};
        
        System.out.println("\n=== RECORRIENDO PUBLICACIONES ===");
        for (int i = 0; i < publicaciones.length; i++) {
            Object publicacion = publicaciones[i];
            
            if (publicacion instanceof Libro) {
                System.out.println("Posición " + i + ": Es un libro");
                ((Libro) publicacion).leer();
            } else if (publicacion instanceof Revista) {
                System.out.println("Posición " + i + ": Es una revista");
                ((Revista) publicacion).leer();
            }
            System.out.println();
        }
    }
}