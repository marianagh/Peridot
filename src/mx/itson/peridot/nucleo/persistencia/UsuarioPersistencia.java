package mx.itson.peridot.nucleo.persistencia;

import java.util.ArrayList;
import java.util.List;

import mx.itson.peridot.nucleo.entidades.Usuario;

import org.hibernate.Session;

/**
 * Define e implementa los métodos de persistencia de la entidad usuario.
 * @author Mariana
 *
 */

public class UsuarioPersistencia {
	/**
	 * Obtiene todos los usuarios registrados.
	 * @return Lista de usuarios registrados.
	 */
	@SuppressWarnings("unchecked")
	public List<Usuario> obtenerTodos(){
		Session session  = null;
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			usuarios = (List<Usuario>) session.createQuery("from Usuario").list();
		}
		catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return usuarios;
	}
	/**
	 * Guarda un usuario en la base de datos.
	 * @param usuario El usuario a guardar.
	 */
	public void guardar(Usuario usuario){
		
		Session session = null;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.saveOrUpdate(usuario);
		}catch(Exception ex) {
			
			System.out.println(ex.getMessage());
		}
		
	}
	/**
	 * Borra un usuario de la base de datos.
	 * @param usuario El usuario a borrar.
	 */
	public void borrar(Usuario usuario){
		
		Session session = null;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.delete(usuario);
		}catch(Exception ex) {
			
			System.out.println(ex.getMessage());
		}
		
	}
	

}
