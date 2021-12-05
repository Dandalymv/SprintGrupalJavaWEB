package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Capacitacion;
import model.DAO.CapacitacionDAOImpl;

/**
 * Servlet implementation class ActualizarCapacitacionUpdate
 */
@WebServlet("/ActualizarCapacitacionUpdate")
public class ActualizarCapacitacionUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarCapacitacionUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/views/actualizarCapacitacion.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CapacitacionDAOImpl cDAO = new CapacitacionDAOImpl();
		Capacitacion c = new Capacitacion();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String RutCliente = request.getParameter("rutCliente");
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		String duracion = request.getParameter("duracion");
		int cantAsist = Integer.parseInt(request.getParameter("cantAsist"));
		
		c.setId(id);
		c.setRutCliente(RutCliente);
		c.setDia(dia);
		c.setHora(hora);
		c.setLugar(lugar);
		c.setDuracion(duracion);
		c.setCantAsist(cantAsist);
		
		cDAO.update(c);
		
		response.sendRedirect("ListarCapacitacion");
	}

}
