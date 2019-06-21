package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Asesores;
import Vista.InterfazVista;

public class Controlador implements ActionListener{
	
	private InterfazVista vista;
	private Asesores modelo;
			
	public Controlador(InterfazVista vista, Asesores modelo) {
		
		this.vista = vista;
		this.modelo = modelo;
	}

	public void actionPerformed(ActionEvent evento) {
		String nombreAsesor = vista.getNombreAsesor();
		int idAsesor = vista.getIdAsesor();
		boolean estadoAsesor = vista.getEstadoAsesor();
		
		modelo.crearAsesor(nombreAsesor, idAsesor, estadoAsesor);
		modelo.listarAserores();
//		vista.escribeAsesor("Asesor creado");
	}

}
