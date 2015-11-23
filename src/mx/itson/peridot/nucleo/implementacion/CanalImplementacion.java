package mx.itson.peridot.nucleo.implementacion;


import javax.swing.JOptionPane;

import mx.itson.peridot.nucleo.entidades.Canal;
import mx.itson.peridot.nucleo.interfaces.ICanal;
import mx.itson.peridot.nucleo.persistencia.CanalPersistencia;



public class CanalImplementacion implements ICanal {
	/**
	 * Guarda un canal.
	 * @param nombre El nombre del canal.
	 * @param sintonia El numero de sintonia del canal.
	 */
	@Override
	public void guardar(String nombre, int sintonia) {
		if (this.validarCanal(nombre, sintonia)){
			
			JOptionPane.showMessageDialog(null, this, "El canal ya existe con ese numero de sintonia.", JOptionPane.ERROR_MESSAGE);
			
		}else {
			Canal canal = new Canal();
			canal.setId(sintonia);
			canal.setNombre(nombre);
			CanalPersistencia pCanal = new CanalPersistencia();
			pCanal.guardar(canal);
			JOptionPane.showMessageDialog(null, this, "Se ha guardado de manera exitosa.", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}

	@Override
	public void borrar(Canal canal) {
		CanalPersistencia pCanal = new CanalPersistencia();
		pCanal.borrar(canal);
		
	}

	@Override
	public Canal buscarPorSintonia(int canal) {
		CanalPersistencia pCanal = new CanalPersistencia();
		
		return pCanal.obtenerPorNumero(canal);
	}

	@Override
	public boolean validarCanal(String nombre, int sintonia) {
		CanalPersistencia pCanal = new CanalPersistencia();
		if (pCanal.obtenerPorNumero(sintonia) ==  null){
		return false;	
		} else {
			return true;
		}	
	}



}
