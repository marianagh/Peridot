package mx.itson.peridot.nucleo.entidades;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


/**
 * Representa la entidad programacion.
 * @author Mariana
 *
 */
@Entity
public class Programacion {

	private int id;
	private Date fecha;
	private Programa programa;
	private Usuario usuario;
		
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
	 * @return El valor del atributo fecha.
	 */
	@Basic
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha El valor a asignar en el atributo fecha.
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return El valor del atributo programas.
	 */
	@ManyToOne()
	@JoinColumn(name = "idprograma")
	public Programa getPrograma() {
		return programa;
	}
	/**
	 * @param programas El valor a asignar en el atributo programas.
	 */
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	/**
	 * @return El valor del atributo usuario.
	 */
	@OneToOne()
	@JoinColumn(name = "idusuario")
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario El valor a asignar en el atributo usuario.
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
