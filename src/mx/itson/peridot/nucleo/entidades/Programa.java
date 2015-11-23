package mx.itson.peridot.nucleo.entidades;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Representa la entidad programa.
 * @author Mariana
 *
 */
@Entity
public class Programa {

	private int id;
	private String nombre;
	private double duracion;
	private String sinopsis;
	private String clasificacion;
	
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
	 * @return El valor del atributo duracion.
	 */
	@Basic
	public double getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion El valor a asignar en el atributo duracion.
	 */
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	
	/**
	 * @return El valor del atributo sinopsis.
	 */
	@Basic
	public String getSinopsis() {
		return sinopsis;
	}
	/**
	 * @param sinopsis El valor a asignar en el atributo sinopsis.
	 */
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	
	
	/**
	 * @return El valor del atributo clasificacion.
	 */
	@Basic
	public String getClasificacion() {
		return clasificacion;
	}
	/**
	 * @param clasificacion El valor a asignar en el atributo clasificacion.
	 */
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	
}
