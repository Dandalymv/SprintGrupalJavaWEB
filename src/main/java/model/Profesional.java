package model;

public class Profesional extends Usuario{
	
	private String id, titulo, fechaIngreso;
	
	public Profesional() {
		
	}

	public Profesional(String run, String nombre, String fechaNac, String id, String titulo,
			String fechaIngreso) {
		super(run, nombre, fechaNac);
		this.id = id;
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
}
