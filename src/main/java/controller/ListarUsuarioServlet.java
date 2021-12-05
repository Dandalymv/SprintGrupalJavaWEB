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
import model.Cliente;
import model.Profesional;
import model.Usuario;
import model.DAO.CapacitacionDAOImpl;
import model.DAO.UsuarioDAOImpl;

/**
 * Servlet implementation class ListarUsuario
 */
@WebServlet("/ListarUsuario")
public class ListarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsuarioDAOImpl admDAO = new UsuarioDAOImpl();
		UsuarioDAOImpl proDAO = new UsuarioDAOImpl();
		UsuarioDAOImpl clienteDAO = new UsuarioDAOImpl();
		
		
		List<Administrativo> adm = admDAO.readUserAdm();
		List<Profesional> pro = proDAO.readUserPro();
		List<Cliente> cliente = clienteDAO.readUserCliente();
		
		
		request.setAttribute("adm", adm);
		request.setAttribute("pro", pro);
		request.setAttribute("cliente", cliente);
		
		getServletContext().getRequestDispatcher("/views/listarUsuario.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
