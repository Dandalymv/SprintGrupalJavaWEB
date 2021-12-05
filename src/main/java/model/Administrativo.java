package model;

public class Administrativo extends Usuario {

	private String id, area, experiencia;
	
	public Administrativo() {
		
	}

	public Administrativo(String run, String nombre, String fechaNac, String id, String area,
			String experiencia) {
		super(run, nombre, fechaNac);
		this.id = id;
		this.area = area;
		this.experiencia = experiencia;
	}

	public String getArea() {
		return area;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experiencia=" + experiencia + "]";
	}
	
	
	
}
