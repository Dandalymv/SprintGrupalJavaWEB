package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Capacitacion;
import model.UsuarioFull;
import model.DAO.CapacitacionDAOImpl;

/**
 * Servlet implementation class ActualizarCapacitacion
 */
@WebServlet("/ActualizarCapacitacion")
public class ActualizarCapacitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarCapacitacionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//getServletContext().getRequestDispatcher("/views/actualizarCapacitacion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		CapacitacionDAOImpl listDAO = new CapacitacionDAOImpl();
		Capacitacion c = listDAO.readOne(id);
		listDAO.readOne(id);
		ArrayList<Capacitacion> capas = new ArrayList<Capacitacion>();
		capas.add(c);
		request.setAttribute("capas", capas);
		getServletContext().getRequestDispatcher("/views/actualizarCapacitacion.jsp").forward(request, response);
		
	}
		
	

}
