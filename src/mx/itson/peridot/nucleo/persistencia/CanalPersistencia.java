package mx.itson.peridot.nucleo.persistencia;
import java.util.ArrayList;
import java.util.List;

import mx.itson.peridot.nucleo.entidades.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 * Define los metodos de persistencia relacionados al canal.
 * @author Mariana
 *
 */

public class CanalPersistencia {
	/**
	 * Obtiene todos los registros de canales.
	 * @return Los canales registrados.
	 */
	@SuppressWarnings("unchecked")
	public List<Canal> obtenerTodos(){
		Session session  = null;
		List<Canal> canales = new ArrayList<Canal>();
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			canales = (List<Canal>) session.createQuery("from Canal").list();
			session.close();
		}
		catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return canales;
	}
	/**
	 * Guarda un canal en la base de datos.
	 * @param canal El canal a guardar.
	 */
	public void guardar(Canal canal){
		
		Session session = null;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.saveOrUpdate(canal);
			session.close();
		}catch(Exception ex) {
			
			System.out.println(ex.getMessage());
		}
		
	}
	
	/**
	 * Borra un canal del registro.
	 * @param canal El canal a borrar.
	 */
	public void borrar(Canal canal){
		
		Session session = null;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.delete(canal);
			session.close();
		}catch(Exception ex) {
			
			System.out.println(ex.getMessage());
		}
		
	}
	/**
	 * Obtiene un canal por el numero de sintonia.
	 * @param sintonia La sintonia del canal a obtener.
	 * @return El canal con sintonia indicada.
	 */
	public Canal obtenerPorNumero(int sintonia) {
		Canal canal = new Canal();
		
		try {
			
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			Criteria criteria = sesion.createCriteria(Canal.class);
			criteria.add(Restrictions.eq("sintonia", sintonia));
			canal = (Canal) criteria.uniqueResult();
			sesion.close();
			
			} catch (Exception ex){
				System.out.println(ex.getCause());
			}
		return canal;
	}
	
	public String[][] datos()
	{ 	
		int filas = this.obtenerTodos().size();
		String[][] data = new String[filas][2];
		
	
		int i = 0;
			for(Canal c : this.obtenerTodos())
			{
				data[i][0] = String.valueOf(c.getNombre());
				data[i][1] = String.valueOf(c.getSintonia());
				i++;
			}
	
		return data;
	}
	

}
