package Vista;

import Controlador.Controlador;

public interface InterfazVista {
	
	void setControlador(Controlador controlAsesor);
	void arranca();
	
	String getNombreAsesor(); 		// Datos que recibe el metodo de crearAsesor.
	int getIdAsesor();		  		// Datos que recibe el metodo de crearAsesor.
	boolean getEstadoAsesor();		// Datos que recibe el metodo de crearAsesor.
	void escribeAsesor(String s);	// Texto con los asesores.
	
}
