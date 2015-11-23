package mx.itson.peridot.nucleo.persistencia;

import java.util.ArrayList;
import java.util.List;



import java.util.Vector;

import mx.itson.peridot.nucleo.entidades.Canal;
import mx.itson.peridot.nucleo.entidades.Programa;

import org.hibernate.Session;

/**
 * Define los metodos de persistencia relacionados a la entidad programa.
 * @author Mariana
 *
 */
public class ProgramaPersistencia {
	/**
	 * Obtiene todos los programas almacenados.
	 * @return Lista de programas almacenados.
	 */
	@SuppressWarnings("unchecked")
	public List<Programa> obtenerTodos(){
		Session session  = null;
		List<Programa> programas = new ArrayList<Programa>();
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			programas = (List<Programa>) session.createQuery("from Programa").list();
		}
		catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return programas;
	}
	/**
	 * Guarda un programa en la base de datos.
	 * @param programa El programa a guardar.
	 */
	public void guardar(Programa programa) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.saveOrUpdate(programa);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
	}
	/**
	 * Borra un programa de la base de datos.
	 * @param programa El programa a borrar.
	 */
	public void borrar(Programa programa) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.delete(programa);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
	}
	/**
	 * Convierte la lista de programas a un arreglo de strings.
	 * @return El arreglo de strings.
	 */
	public String[][] datos() {
		int filas = this.obtenerTodos().size();
		String[][] data = new String[filas][2];
		
	
		int i = 0;
			for(Programa p : this.obtenerTodos())
			{
				data[i][0] = String.valueOf(p.getNombre());
				data[i][1] = String.valueOf(p.getSinopsis());
				data[i][2] = String.valueOf(p.getDuracion());
				data[i][2] = String.valueOf(p.getClasificacion());
				i++;
			}
	
		return data;
	}
	
/*	public List<Programa> buscarPorCanal(String nombre) {
		Session session = null;
		List<Programas> programas = ()
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
	}*/
	

}
