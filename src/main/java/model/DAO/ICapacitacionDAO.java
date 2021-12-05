package model.DAO;

import java.util.List;

import model.Capacitacion;
import model.Usuario;


public interface ICapacitacionDAO {
	/*-- ***********************Métodos C.R.U.D. de Capacitación*********************** --*/
	public void create(Capacitacion c);
	public List<Capacitacion> readCap();
	public Capacitacion readOne(int id);
	public void update(Capacitacion c);
	public void deleteCap(int id);
	
	

}
