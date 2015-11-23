package mx.itson.peridot.nucleo.persistencia;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Representa los metodos de Hibernate.
 * @author Jesús
 * 
 */

public class HibernateUtil {

	/**
	 * Define el inicio de sesion de Hibernate.
	 * @author Jesús
	 * Version 0.1
	 */
	
private static final SessionFactory sessionFactory;
	
	static{
		
		try{
	
			sessionFactory = new Configuration().configure().buildSessionFactory();
			
		} catch (HibernateException ex){
			System.err.println("Ocurrio un error al inicializar la configuracion");
			throw new HibernateException(ex);
		}
		
	}
	
	/**
	 * Obtiene la sesion activa de Hibernate.
	 * @return Sesion de Hibernate de tipo SessionFactory.
	 */
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
}
