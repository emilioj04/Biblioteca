public class Revista extends Publicacion implements Prestable, Reservar {

	private String autor;
	private String editor;

	// Constructor
	public Revista(String titulo, int año, String autor, String editor) {
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
		System.out.println("La revista '" + obtenerTitulo() + "' no se puede prestar.");
	}

	@Override
	public void devolver() {
		System.out.println("La revista '" + obtenerTitulo() + "' no se puede devolver.");
	}

	// Implementación de métodos de la interfaz Reservar
	@Override
	public void reservar() {
		System.out.println("La revista '" + obtenerTitulo() + "' no se puede reservar.");
	}

	@Override
	public void cancelarReserva() {
		System.out.println("La reserva de la revista '" + obtenerTitulo() + "' ha sido cancelada.");
	}
}
