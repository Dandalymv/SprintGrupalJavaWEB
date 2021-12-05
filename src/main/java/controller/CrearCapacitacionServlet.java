package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Capacitacion;
import model.Conexion;
import model.DAO.CapacitacionDAOImpl;

/**
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet("/CrearCapacitacion")
public class CrearCapacitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CrearCapacitacionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		getServletContext().getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		CapacitacionDAOImpl pDAO = new CapacitacionDAOImpl();
		
		
		Capacitacion c = new Capacitacion(request.getParameter("rutCliente"),
				request.getParameter("dia"),
				request.getParameter("hora"),
				request.getParameter("lugar"),
				request.getParameter("duracion"),
				Integer.parseInt(request.getParameter("cantAsist")));

		pDAO.create(c);

		request.getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request, response);

	}

}
