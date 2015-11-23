package mx.itson.peridot.nucleo.entidades;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Representa la entidad usuario
 * @author Mariana
 *
 */
@Entity
public class Usuario {

	private int id;
	private String nombre;
	private String contraseña;
	
	
	/**
	 * @return El valor del atributo id.
	 */
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	/**
	 * @param id El valor a asignar en el atributo id.
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return El valor del atributo nombre.
	 */
	@Basic
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre El valor a asignar en el atributo nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return El valor del atributo contraseña.
	 */
	@Basic
	public String getContraseña() {
		return contraseña;
	}
	/**
	 * @param contraseña El valor a asignar en el atributo contraseña.
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	
}
