package mx.itson.peridot.nucleo.persistencia;

import java.util.ArrayList;
import java.util.List;

import mx.itson.peridot.nucleo.entidades.Canal;
import mx.itson.peridot.nucleo.entidades.Programacion;

import org.hibernate.Session;

public class ProgramacionPersistencia {

	/**
	 * Obtiene la lista de todas las programaciones registradas.
	 * @return La lista de las programaciones registradas.
	 */
	@SuppressWarnings("unchecked")
	public List<Programacion> obtenerTodos(){
		Session session  = null;
		List<Programacion> programaciones = new ArrayList<Programacion>();
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			programaciones = (List<Programacion>) session.createQuery("from Programacion").list();
		}
		catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return programaciones;
	}
	/**
	 * Obtiene la programacion de un canal.
	 * @param canal El canal a buscar.
	 * @return Lista de programacion del canal buscado.
	 */
	public List<Programacion> obtenerPorCanal(Canal canal){
	
		List<Programacion> programaciones = new ArrayList<Programacion>();
		CanalPersistencia cp = new CanalPersistencia();
		try {
			
			programaciones = (List<Programacion>) cp.obtenerPorNumero(canal.getSintonia()).getProgramaciones();
		}
		catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return programaciones;
	}
}
