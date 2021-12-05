package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Capacitacion;
import model.Conexion;
import model.Contacto;

public class ContactoDAOImpl implements IContactoDAO{

	private Connection cn = null;
	
	
	@Override
	public List<Contacto> readContact() {
		
		String sql = "select nombre, email, sexo, direccion, ciudad, region from contacto ";
		ArrayList<Contacto> conta = new ArrayList<Contacto>();
		
		try {
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			
			while(rs.next()) {
				conta.add(new Contacto(rs.getString("nombre"), rs.getString("email"), 
						rs.getString("sexo"), rs.getString("direccion"), rs.getString("ciudad"), 
						rs.getString("region")));
			}
			stm.execute(sql);
			stm.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return conta;
		
		
	}
	
	
	
	
	

}
