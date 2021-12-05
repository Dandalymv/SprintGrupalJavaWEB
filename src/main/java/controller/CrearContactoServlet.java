package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Administrativo;
import model.Capacitacion;
import model.Contacto;
import model.DAO.CapacitacionDAOImpl;
import model.DAO.ContactoDAOImpl;

/**
 * Servlet implementation class Contacto
 */
@WebServlet("/Contacto")
public class CrearContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearContactoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		getServletContext().getRequestDispatcher("/views/crearContacto.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String sexo = request.getParameter("sexo");
		String direccion = request.getParameter("direccion");
		String ciudad = request.getParameter("ciudad");
		String region = request.getParameter("region");
		String sexo2 = "--Seleccione--";
		String region2 = "Region...";
		
		
		CapacitacionDAOImpl cDAO = new CapacitacionDAOImpl();
		ContactoDAOImpl contaDAO = new ContactoDAOImpl();
		List<Contacto> contaListaDAO = contaDAO.readContact();
		List<Capacitacion> cap = cDAO.readCap();
		Contacto conta = new Contacto();
		
		if(nombre != "" && email != "" && (!sexo2.equals(sexo)) && direccion != "" && ciudad != "" && (!region2.equals(region))) {
			
			conta.setNombre(nombre);
			conta.setEmail(email);
			conta.setSexo(sexo);
			conta.setDireccion(direccion);
			conta.setCiudad(ciudad);
			conta.setRegion(region);
			
			cDAO.createContacto(conta);
			
		}else {
			System.out.println("------------------------------------------------");
			System.out.println("Datos Incompletos Rellene los campos solicitados");
			System.out.println("------------------------------------------------");
		}
		
		
		for(Contacto contactos: contaListaDAO) {
			System.out.print("| Nombre: " + contactos.getNombre() + "| Email: " + contactos.getEmail() + 
					"| Sexo: " + contactos.getSexo() + "| Direccion: "+ contactos.getDireccion() + 
					"| Ciudad: " + contactos.getCiudad()); 
		}
		

		getServletContext().getRequestDispatcher("/views/crearContacto.jsp").forward(request, response);
		
	}

}
