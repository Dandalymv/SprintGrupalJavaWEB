package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Administrativo;
import model.Cliente;
import model.Profesional;
import model.DAO.CapacitacionDAOImpl;
import model.DAO.ContactoDAOImpl;
import model.DAO.UsuarioDAOImpl;



/**
 * Servlet implementation class CrearUsuarioServlet
 */
@WebServlet("/CrearUsuario")
public class CrearUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/views/crearUsuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String run = request.getParameter("run");
		String nombre = request.getParameter("nombre");
		String fechaNac = request.getParameter("fechaNac");
		String area = request.getParameter("area");
		String experiencia = request.getParameter("experiencia");
		String titulo = request.getParameter("titulo");
		String fechaIngreso = request.getParameter("fechaIngreso");
		String rut = request.getParameter("rut");
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String telefono = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		String comuna = request.getParameter("comuna");
		String afp = request.getParameter("afp");
		String edad = request.getParameter("edad");
		String prevSaludForm = request.getParameter("prevSaludForm");
		String prevSalud = "0";
		
		String fechaNac2 = "dd-mm-aaaa";
		String fechaIngreso2 = "dd-mm-aaaa";
		String area2 = "--Seleccione--";
		String experiencia2 = "--Seleccione--";
		String afp2 = "--Seleccione--";
		String prevSaludForm2 = "prevSaludForm";
		
		//Asignar valor 1 o 2 a Sistema de salud dependiendo de la seleccion Fonasa / Isapre
		
		if(prevSaludForm != null) {
			if(prevSaludForm.equals("Fonasa")) {
				prevSalud = "1";
			} 
			if (prevSaludForm.equals("Isapre")) {
				prevSalud = "2";
			}	
		}
		
		
		UsuarioDAOImpl uDAO = new UsuarioDAOImpl();
		Administrativo adm = new Administrativo();
		Profesional pro = new Profesional();
		Cliente cliente = new Cliente();
		
		
		//Crear Cliente
		if(area == null && titulo == null && run != "" && nombre != "" && fechaNac != "" && rut != ""
				&& nombres != "" && apellidos != "" && telefono != "" && direccion != "" && comuna != ""
				&& (!afp2.equals(afp)) && (!prevSaludForm2.equals(prevSaludForm))) {
			cliente.setRun(run);
			cliente.setNombre(nombre);
			cliente.setFechaNac(fechaNac);
			cliente.setRut(rut);
			cliente.setNombres(nombres);
			cliente.setApellidos(apellidos);
			cliente.setTelefono(telefono);
			cliente.setDireccion(direccion);
			cliente.setComuna(comuna);
			cliente.setAfp(afp);
			cliente.setEdad(edad);
			cliente.setPrevSalud(prevSalud);
			
			uDAO.createUserCliente(cliente);
		}
		
		//Crear Administrativo
		if(titulo == null && rut == null && run != "" && nombre != "" && fechaNac != "" && (!area2.equals(area)) && (!experiencia2.equals(experiencia))) {
			adm.setRun(run);
			adm.setNombre(nombre);
			adm.setFechaNac(fechaNac);
			adm.setArea(area);
			adm.setExperiencia(experiencia);
			
			uDAO.createUserAdm(adm);
		}
		
		
		//Crear Profesional
		if(area == null && rut == null && run != "" && nombre != "" && fechaNac != "" && titulo != "" && fechaIngreso != "") {
			pro.setRun(run);
			pro.setNombre(nombre);
			pro.setFechaNac(fechaNac);
			pro.setTitulo(titulo);
			pro.setFechaIngreso(fechaIngreso);
			
			uDAO.createUserPro(pro);
		}
		
		
		getServletContext().getRequestDispatcher("/views/crearUsuario.jsp").forward(request, response);
			
	}

}
