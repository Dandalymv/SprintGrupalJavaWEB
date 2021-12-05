package model.DAO;

import java.util.List;

import model.Administrativo;
import model.Cliente;
import model.Profesional;
import model.Usuario;
import model.UsuarioFull;

public interface IUsuarioDAO {
	
	/*-- ***********************Métodos C.R.U.D. de Usuario*********************** --*/
	public void createUser(Usuario u);
	public void createUserAdm(Administrativo adm);
	public void createUserPro(Profesional pro);
	public void createUserCliente(Cliente cliente);
	public List<UsuarioFull> readUser();
	public List<Cliente> readUserCliente();
	public List<Profesional> readUserPro();
	public List<Administrativo> readUserAdm();
	public UsuarioFull readOne(int id);
	public void updateUser(Usuario u);
	public void updateUserAdm(Administrativo adm);
	public void updateUserPro(Profesional pro);
	public void updateUserCliente(Cliente cliente);
	public void deleteUser(int id);
	
	
}
