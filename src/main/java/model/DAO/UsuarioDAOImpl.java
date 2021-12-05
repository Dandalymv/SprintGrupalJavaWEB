package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import model.Administrativo;
import model.Cliente;
import model.Conexion;
import model.Profesional;
import model.Usuario;
import model.UsuarioFull;

public class UsuarioDAOImpl implements IUsuarioDAO {

	private Connection cn = null;

	@Override
	public void createUser(Usuario u) {
		String sql = "INSERT INTO usuarios (run, nombre, fechaNac) "
				+ "VALUES ('"
				+ u.getRun() + "','" 
				+ u.getNombre() + "','" 
				+ u.getFechaNac() + "')";
		try {
			
			cn= Conexion.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void createUserAdm(Administrativo adm) {
		String tipoUsuario = "Administrativo";
		String sql = "INSERT INTO usuarios (run, nombre, fechaNac, area, experiencia, tipoUsuario) "
				+ "VALUES ('"
				+ adm.getRun() + "','" 
				+ adm.getNombre() + "','" 
				+ adm.getFechaNac() + "','" 
				+ adm.getArea() + "','" 
				+ adm.getExperiencia() + "','"
				+ tipoUsuario + "')";
		
		try {
			
			cn= Conexion.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void createUserPro(Profesional pro) {
		String tipoUsuario = "Profesional";
		String sql = "INSERT INTO usuarios (run, nombre, fechaNac, titulo, fechaIngreso, tipoUsuario) "
				+ "VALUES ('"
				+ pro.getRun() + "','" 
				+ pro.getNombre() + "','" 
				+ pro.getFechaNac() + "','" 
				+ pro.getTitulo() + "','" 
				+ pro.getFechaIngreso() + "','" 
				+ tipoUsuario + "')";
		
		try {
			
			cn= Conexion.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void createUserCliente(Cliente cliente) {
		String tipoUsuario = "Cliente";
		String sql = "INSERT INTO usuarios (run, nombre, fechaNac, rut, nombres, "
				+ "apellidos, telefono, direccion, comuna, afp, edad, prevSalud, tipoUsuario) "
				+ "VALUES ('"
				+ cliente.getRun() + "','" 
				+ cliente.getNombre() + "','" 
				+ cliente.getFechaNac() + "','" 
				+ cliente.getRut() + "','" 
				+ cliente.getNombres() + "','" 
				+ cliente.getApellidos() + "','" 
				+ cliente.getTelefono() + "','" 
				+ cliente.getDireccion() + "','" 
				+ cliente.getComuna() + "','" 
				+ cliente.getAfp() + "','" 
				+ cliente.getEdad() + "','" 
				+ cliente.getPrevSalud() + "','"
				+ tipoUsuario + "')"; 
		
		try {
			
			cn= Conexion.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<UsuarioFull> readUser() {
		String sql = "select id, run, nombre, fechaNac, area, experiencia, titulo, "
				+ "fechaIngreso, rut, nombres, apellidos, telefono, direccion, comuna, "
				+ "afp, edad, prevSalud, tipoUsuario from usuarios ";
		ArrayList<UsuarioFull> user = new ArrayList<UsuarioFull>();
		
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				user.add(new UsuarioFull(
						rs.getString("id"), 
						rs.getString("run"), 
						rs.getString("nombre"), 
						rs.getString("fechaNac"), 
						rs.getString("area"), 
						rs.getString("experiencia"), 
						rs.getString("titulo"), 
						rs.getString("fechaIngreso"), 
						rs.getString("rut"), 
						rs.getString("nombres"),
						rs.getString("apellidos"), 
						rs.getString("telefono"), 
						rs.getString("direccion"), 
						rs.getString("comuna"), 
						rs.getString("afp"), 
						rs.getString("edad"),
						rs.getString("prevSalud"),
						rs.getString("tipoUsuario")));
			}
			stm.execute(sql);
			stm.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public List<Administrativo> readUserAdm() {
		String sql = "select run, nombre, fechaNac, id, area, experiencia from usuarios where tipoUsuario = 'Administrativo'";
		ArrayList<Administrativo> adm = new ArrayList<Administrativo>();
		
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				adm.add(new Administrativo(
						rs.getString("run"),
						rs.getString("nombre"), 
						rs.getString("fechaNac"),
						rs.getString("id"), 				 
						rs.getString("area"), 
						rs.getString("experiencia")));
			}
			stm.execute(sql);
			stm.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return adm;
	}
	
	@Override
	public List<Profesional> readUserPro() {
		String sql = "select  run, nombre, fechaNac, id, titulo, fechaIngreso from usuarios where tipoUsuario = 'Profesional'";
		ArrayList<Profesional> pro = new ArrayList<Profesional>();
		
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				pro.add(new Profesional(
						rs.getString("run"), 
						rs.getString("nombre"), 
						rs.getString("fechaNac"),
						rs.getString("id"), 
						rs.getString("titulo"), 
						rs.getString("fechaIngreso")));
			}
			stm.execute(sql);
			stm.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return pro;
	}

	
	@Override
	public List<Cliente> readUserCliente() {
		String sql = "select run, nombre, fechaNac, id, rut, nombres, "
				+ "apellidos, telefono, direccion, comuna, "
				+ "afp, edad, prevSalud from usuarios where tipoUsuario = 'Cliente' ";
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				cliente.add(new Cliente(	
						rs.getString("run"), 
						rs.getString("nombre"), 
						rs.getString("fechaNac"), 
						rs.getString("id"), 
						rs.getString("rut"), 
						rs.getString("nombres"),
						rs.getString("apellidos"), 
						rs.getString("telefono"), 
						rs.getString("direccion"), 
						rs.getString("comuna"), 
						rs.getString("afp"), 
						rs.getString("edad"),
						rs.getString("prevSalud")));
			}
			stm.execute(sql);
			stm.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return cliente;
	}
	
	
	public UsuarioFull readOne(int id) {
		String sql = "select id, run, nombre, fechaNac, area, experiencia, titulo, fechaIngreso, "
				+ "rut, nombres, apellidos, telefono, direccion, comuna, afp, edad, prevSalud, tipoUsuario "
				+ "from usuarios where id = " + id;
		UsuarioFull u = null;
		
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				u = new UsuarioFull(
						rs.getString("id"), 
						rs.getString("run"), 
						rs.getString("nombre"), 
						rs.getString("fechaNac"), 
						rs.getString("area"), 
						rs.getString("experiencia"), 
						rs.getString("titulo"), 
						rs.getString("fechaIngreso"), 
						rs.getString("rut"), 
						rs.getString("nombres"),
						rs.getString("apellidos"), 
						rs.getString("telefono"), 
						rs.getString("direccion"), 
						rs.getString("comuna"), 
						rs.getString("afp"), 
						rs.getString("edad"),
						rs.getString("prevSalud"),
						rs.getString("tipoUsuario"));
			}
			
			rs.close();
			stm.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return u;
	}
	
	
	

	@Override
	public void updateUserAdm(Administrativo adm) {
		
	}
	
	@Override
	public void updateUserPro(Profesional pro) {
		String sql = "update usuarios set run = '" + pro.getRun() + "', nombre = '" + pro.getNombre() + "', "
				+ "fechaNac = '" + pro.getFechaNac() + "', titulo = '" + pro.getTitulo() + "', fechaIngreso = '" 
				+ pro.getFechaIngreso() + "'WHERE id ='" + pro.getId() + "'";
		
		try { 
			
			cn= Conexion.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void updateUserCliente(Cliente cliente) {
		String sql = "update usuarios set "
				+ "run = '" + cliente.getRun() + "', "
				+ "nombre = '" + cliente.getNombre() + "', " 
				+ "fechaNac = '" + cliente.getFechaNac() + "', "
				+ "rut = '" + cliente.getRut() + "', "
				+ "nombres = '" + cliente.getNombres() + "', " 
				+ "apellidos = '" + cliente.getApellidos() + "', "
				+ "telefono = '" + cliente.getTelefono() + "', "
				+ "direccion = '" + cliente.getDireccion() + "', "
				+ "comuna = '" + cliente.getComuna() + "', "
				+ "afp = '" + cliente.getAfp() + "', "
				+ "edad = '" + cliente.getEdad() + "', "
				+ "prevSalud = '" + cliente.getPrevSalud() +
				"'WHERE id ='" + cliente.getId() + "'";
		
		try { 
			
			cn= Conexion.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteUser(int id) {
		String sql = "DELETE FROM usuarios WHERE id = '" + id + "'";	
		
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			
			stm.execute(sql);
			stm.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	

	}

	@Override
	public void updateUser(Usuario u) {
		// TODO Auto-generated method stub
		
	}
}
