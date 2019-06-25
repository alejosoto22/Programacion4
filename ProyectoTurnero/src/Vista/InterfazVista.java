package Vista;

import Controlador.ControladorAsesores;

public interface InterfazVista {
	
	void setControladorAsesor(ControladorAsesores controlAsesor);
//	void setControladorServicio(ControladorAsesores controlServicio);
	void arranca();
	
	String getNombreAsesor(); 		// Datos que recibe el metodo de crearAsesor.
	int getIdAsesor();		  		// Datos que recibe el metodo de crearAsesor.
	boolean getEstadoAsesor();		// Datos que recibe el metodo de crearAsesor.
	
}
