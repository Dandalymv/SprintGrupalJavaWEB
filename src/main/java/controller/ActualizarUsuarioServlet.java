package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Profesional;
import model.UsuarioFull;
import model.DAO.UsuarioDAOImpl;

/**
 * Servlet implementation class ActualizarUsuario
 */
@WebServlet("/ActualizarUsuario")
public class ActualizarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getServletContext().getRequestDispatcher("/views/actualizarUsuario.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		String tipo = request.getParameter("tipoUsuario");
		
		UsuarioDAOImpl listDAO = new UsuarioDAOImpl();
		UsuarioFull u = listDAO.readOne(id);
		listDAO.readOne(id);
		
		
		ArrayList<UsuarioFull> users = new ArrayList<UsuarioFull>();
		users.add(u);
		
		request.setAttribute("users", users);
		
		switch(tipo) {
		
		case "profesional":
			getServletContext().getRequestDispatcher("/views/actualizarProfesional.jsp").forward(request, response);
			break;
			
		case "administrativo":
			getServletContext().getRequestDispatcher("/views/actualizarAdministrativo.jsp").forward(request, response);
			break;
			
		case "cliente":
			getServletContext().getRequestDispatcher("/views/actualizarCliente.jsp").forward(request, response);
			break;
		}

		
	}

}
