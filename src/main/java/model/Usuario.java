package model;

public class Usuario {
	
	private String run;
	private String nombre;
	private String fechaNac;
	
	public Usuario(){
		
	}

	public Usuario(String run, String nombre, String fechaNac) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	@Override
	public String toString() {
		return "Usuario [run=" + run + ", nombre=" + nombre + ", fechaNac=" + fechaNac + "]";
	}
	
	
	

}
