package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Asesores;
import Modelo.Servicios;
import Vista.InterfazVista;

public class ControladorAsesores implements ActionListener {
	
	private InterfazVista vista;
	private Asesores modeloAsesores;
	private Servicios modeloServicios;
		
	public ControladorAsesores(InterfazVista vista, Asesores modeloAsesores, Servicios modeloServicios) {
		this.vista = vista;
		this.modeloAsesores = modeloAsesores;
		this.modeloServicios = modeloServicios;
	}
	
	public void actionPerformed(ActionEvent evento) {
		String nombreAsesor = vista.getNombreAsesor();
		int idAsesor = vista.getIdAsesor();
		boolean estadoAsesor = vista.getEstadoAsesor();
		String nombreServicio = vista.getNombreServicio();
		
		modeloAsesores.crearAsesor(nombreAsesor, idAsesor, estadoAsesor);
		modeloServicios.crearServicio(nombreServicio);	
	}

}
