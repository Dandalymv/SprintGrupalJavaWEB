package model;

public class Cliente extends Usuario{

	private String id, rut , nombres, apellidos, telefono, direccion, comuna, afp;
	String edad;
	private String prevSalud ;

	public Cliente() {
		
	}

	public Cliente(String run, String nombre, String fechaNac, String id, String rut, String nombres,
			String apellidos, String telefono, String direccion, String comuna, String afp, String edad,
			String prevSalud) {
		super(run, nombre, fechaNac);
		this.id = id;
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.comuna = comuna;
		this.afp = afp;
		this.edad = edad;
		this.prevSalud = prevSalud;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getPrevSalud() {
		return prevSalud;
	}

	public void setPrevSalud(String prevSalud) {
		this.prevSalud = prevSalud;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", comuna=" + comuna + ", afp=" + afp + ", edad=" + edad + ", prevSalud="
				+ prevSalud + "]";
	}

	

	
}
