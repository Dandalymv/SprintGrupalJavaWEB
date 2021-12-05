package model;

public class Contacto {
	
	private String nombre;
	private String email;
	private String sexo;
	private String direccion;
	private String ciudad;
	private String region;
	
	public Contacto() {
		
	}

	public Contacto(String nombre, String email, String sexo, String direccion, String ciudad, String region) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.sexo = sexo;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.region = region;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", email=" + email + ", sexo=" + sexo + ", direccion=" + direccion
				+ ", ciudad=" + ciudad + ", region=" + region + "]";
	}
	
	
	
	

}
