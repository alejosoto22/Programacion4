package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Asesores;
import Modelo.Servicios;
import Vista.InterfazVista;
import Vista.InterfazVistaServicios;

public class ControladorServicios implements ActionListener{
	
	private InterfazVistaServicios vistaServicios;
	private Servicios modeloServicios;
	
	public ControladorServicios(InterfazVistaServicios vistaServicios, Servicios modeloServicios) {
		this.vistaServicios = vistaServicios;
		this.modeloServicios = modeloServicios;
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		String nombreServicio = vistaServicios.getNombreServicio();
				
		modeloServicios.crearServicio(nombreServicio);
	
	}

}
