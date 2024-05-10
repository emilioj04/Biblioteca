public class Periodico extends Publicacion implements Prestable, Reservar {

	private String autor;
	private String editor;

	// Constructor
	public Periodico(String titulo, int año, String autor, String editor) {
		super(titulo, año); // Llama al constructor de la clase base
		this.autor = autor;
		this.editor = editor;
	}

	// Métodos getters y setters para autor y editor
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
		System.out.println("El periódico '" + obtenerTitulo() + "' ha sido prestado.");
	}

	@Override
	public void devolver() {
		System.out.println("El periódico '" + obtenerTitulo() + "' ha sido devuelto.");
	}

	// Implementación de métodos de la interfaz Reservar
	@Override
	public void reservar() {
		System.out.println("El periódico '" + obtenerTitulo() + "' ha sido reservado.");
	}

	@Override
	public void cancelarReserva() {
		System.out.println("La reserva del periódico '" + obtenerTitulo() + "' ha sido cancelada.");
	}
}