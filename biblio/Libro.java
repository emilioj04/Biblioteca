public class Libro extends Publicacion implements Prestable, Reservar {

	private String autor;
	private String editor;
	private double tasaInteresPrestamo = 0.05;
	private boolean prestado = false;

	// Constructor
	public Libro(String titulo, int año, String autor, String editor) {
		super(titulo, año); // Llama al constructor de la clase base
		this.autor = autor;
		this.editor = editor;
	}

	// Métodos getters y setters
	public String obtenerAutor() {
		return autor;
	}

	public void establecerAutor(String autor) {
		this.autor = autor;
	}

	public String obtenerEditor() {
		return editor;
	}

	public void establecerEditor(String editor) {
		this.editor = editor;
	}

	// Implementación de métodos de la interfaz Prestable
	@Override
	public void prestar() {
		if (!prestado) {
			prestado = true;
			System.out.println("El libro '" + obtenerTitulo() + "' ha sido prestado.");
		} else {
			System.out.println("El libro '" + obtenerTitulo() + "' ya está prestado.");
		}
	}

	@Override
	public void devolver() {
		if (prestado) {
			prestado = false;
			System.out.println("El libro '" + obtenerTitulo() + "' ha sido devuelto.");
		} else {
			System.out.println("El libro '" + obtenerTitulo() + "' no estaba prestado.");
		}
	}

	// Implementación de métodos de la interfaz Reservar
	@Override
	public void reservar() {
		System.out.println("El libro '" + obtenerTitulo() + "' ha sido reservado.");
	}

	@Override
	public void cancelarReserva() {
		System.out.println("La reserva del libro '" + obtenerTitulo() + "' ha sido cancelada.");
	}
}