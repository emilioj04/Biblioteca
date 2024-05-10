public class Main {
    public static void main(String[] args) {
        // Crear instancia de Usuario
        Usuario usuario = new Usuario();
        usuario.establecerId(1);

        // Crear instancia de Libro
        Libro libro = new Libro("El principito", 1943, "Antoine de Saint-Exupéry", "Editorial XYZ");

        // Crear instancia de Periodico
        Periodico periodico = new Periodico("Diario ABC", 2024, "Editorial ABC", "Director X");

        // Crear instancia de Revista
        Revista revista = new Revista("National Geographic", 2024, "National Geographic Society", "Editorial XYZ");

        // Ejemplo de préstamo de libro
        libro.prestar();
        libro.devolver();

        // Ejemplo de reserva de revista
        revista.reservar();
    }
}

