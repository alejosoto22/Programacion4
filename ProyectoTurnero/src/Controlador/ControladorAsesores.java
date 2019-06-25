package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Asesores;
import Modelo.Servicios;
import Vista.InterfazVista;

public class ControladorAsesores implements ActionListener {
	
	private InterfazVista vista;
	private Asesores modeloAsesores;
		
	public ControladorAsesores(InterfazVista vista, Asesores modeloAsesores) {
		this.vista = vista;
		this.modeloAsesores = modeloAsesores;
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		String nombreAsesor = vista.getNombreAsesor();
		int idAsesor = vista.getIdAsesor();
		boolean estadoAsesor = vista.getEstadoAsesor();
		
		modeloAsesores.crearAsesor(nombreAsesor, idAsesor, estadoAsesor);
			
	}

}
