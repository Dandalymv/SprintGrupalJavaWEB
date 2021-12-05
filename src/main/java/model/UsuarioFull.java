package model;

public class UsuarioFull {

	/*Se crea esta clase para obtener un solo arraylist completo desde la base de datos*/
	
	private String id, run, nombre, fechaNac, area, experiencia, 
	titulo, fechaIngreso, rut, nombres, apellidos, telefono, direccion, 
	comuna, afp, edad, prevSalud, tipoUsuario;
	
	public UsuarioFull() {
		
	}

	public UsuarioFull(String id, String run, String nombre, String fechaNac, String area, String experiencia,
			String titulo, String fechaIngreso, String rut, String nombres, String apellidos, String telefono,
			String direccion, String comuna, String afp, String edad, String prevSalud, String tipoUsuario) {
		super();
		this.id = id;
		this.run = run;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.area = area;
		this.experiencia = experiencia;
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.comuna = comuna;
		this.afp = afp;
		this.edad = edad;
		this.prevSalud = prevSalud;
		this.tipoUsuario = tipoUsuario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getArea() {
		return area;
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
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

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public String toString() {
		return "UsuarioFull [id=" + id + ", run=" + run + ", nombre=" + nombre + ", fechaNac="
				+ fechaNac + ", area=" + area + ", experiencia=" + experiencia + ", titulo=" + titulo
				+ ", fechaIngreso=" + fechaIngreso + ", rut=" + rut + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", telefono=" + telefono + ", direccion=" + direccion + ", comuna=" + comuna + ", afp="
				+ afp + ", edad=" + edad + ", prevSalud=" + prevSalud + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
	
	
	
}
