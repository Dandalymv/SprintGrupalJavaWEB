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
import model.DAO.UsuarioDAOImpl;

/**
 * Servlet implementation class ActualizarUsuarioUpdate
 */
@WebServlet("/ActualizarUsuarioUpdate")
public class ActualizarUsuarioUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarUsuarioUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/views/actualizarAdministrativo.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDAOImpl uDAO = new UsuarioDAOImpl();
		Administrativo adm = new Administrativo();
		Profesional pro = new Profesional();
		Cliente cliente = new Cliente();
		
		String id = request.getParameter("id");
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
		
		
		if(prevSaludForm != null) {
			if(prevSaludForm.equals("Fonasa")) {
				prevSalud = "1";
			} 
			if (prevSaludForm.equals("Isapre")) {
				prevSalud = "2";
			}	
		}
		
		//Crear Cliente
				if(area == null && titulo == null ) {
					cliente.setId(id);
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
					
					uDAO.updateUserCliente(cliente);
				}
				
				//Actualizar Administrativo
				if(titulo == null && rut == null ) {
					adm.setId(id);
					adm.setRun(run);
					adm.setNombre(nombre);
					adm.setFechaNac(fechaNac);
					adm.setArea(area);
					adm.setExperiencia(experiencia);
					
					uDAO.updateUserAdm(adm);
				}
				
				//Actualizar Profesional
				if(area == null && rut == null) {
					pro.setId(id);
					pro.setRun(run);
					pro.setNombre(nombre);
					pro.setFechaNac(fechaNac);
					pro.setTitulo(titulo);
					pro.setFechaIngreso(fechaIngreso);
					
					uDAO.updateUserPro(pro);
				}
				
		response.sendRedirect("ListarUsuario");
	}

}
