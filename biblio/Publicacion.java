public abstract class Publicacion {

	private String Titulo;
	private int año;
	private boolean disponible;

	// Constructor
	public Publicacion(String titulo, int año) {
		this.Titulo = titulo;
		this.año = año;
		this.disponible = true; // Por defecto, la publicación está disponible al crearse
	}

	// Métodos getters y setters
	public String obtenerTitulo() {
		return Titulo;
	}

	public void establecerTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public int obtenerAño() {
		return año;
	}

	public void establecerAño(int año) {
		this.año = año;
	}

	public boolean estaDisponible() {
		return disponible;
	}

	public void establecerDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
