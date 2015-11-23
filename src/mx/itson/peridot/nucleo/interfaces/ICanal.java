package mx.itson.peridot.nucleo.interfaces;

import mx.itson.peridot.nucleo.entidades.Canal;
/**
 * Define los metodos de negocio de la entidad canal.
 * @author Mariana
 *
 */
public interface ICanal {
	public void guardar(String nombre, int sintonia);
	public void borrar(Canal canal);
	public Canal buscarPorSintonia(int canal);
	public boolean validarCanal(String nombre, int sintonia);
}
