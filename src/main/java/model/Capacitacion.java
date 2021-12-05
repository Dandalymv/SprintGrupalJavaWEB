package model;



public class Capacitacion {
	//id, rut_cliente, dia, hora, lugar, duracion, cantidad_asistentes
	
	private int id;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantAsist;
	
	public Capacitacion (){
		
	}
	
	

	public Capacitacion(String rutCliente, String dia, String hora, String lugar, String duracion, int cantAsist) {
		super();
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsist = cantAsist;
	}



	public Capacitacion(int id, String rutCliente, String dia, String hora, String lugar, String duracion, int cantAsist) {
		super();
		this.id = id;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsist = cantAsist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getCantAsist() {
		return cantAsist;
	}

	public void setCantAsist(int cantAsist) {
		this.cantAsist = cantAsist;
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
				+ ", duracion=" + duracion + ", cantAsist=" + cantAsist + "]";
	}
	
	

}
