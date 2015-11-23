package mx.itson.peridot.nucleo.entidades;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * Define los atributos de la entidad Canal.
 * @author Mariana
 *
 */

@Entity
@Table(name="canal")
public class Canal {
	
	private int id;
	private String nombre;
	private int sintonia;
	private List<Programacion> programaciones;
	
	/**
	 * @return El valor de id.
	 */
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	/**
	 * @param Asigna a id el valor de id.
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return El valor de nombre.
	 */
	@Basic
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param Asigna a nombre el valor de nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return El valor de sintonia.
	 */
	@Basic
	public int getSintonia() {
		return sintonia;
	}
	/**
	 * @param Asigna a sintonia el valor de sintonia.
	 */
	public void setSintonia(int sintonia) {
		this.sintonia = sintonia;
	}
	/**
	 * @return El valor de programaciones.
	 */
	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "idCanal")
	public List<Programacion> getProgramaciones() {
		return programaciones;
	}
	/**
	 * @param Asigna a programaciones el valor de programaciones.
	 */
	public void setProgramaciones(List<Programacion> programaciones) {
		this.programaciones = programaciones;
	}
	
	
	

}
