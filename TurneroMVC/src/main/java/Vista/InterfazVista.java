package Vista;

import Controlador.Controlador;

public interface InterfazVista {
	
	void setControlador(Controlador control);
	void arranca();
	
	String getNombreAsesor(); // Datos que recibe el metodo de crearAsesor.
	int getIdAsesor();		  // Datos que recibe el metodo de crearAsesor.
	boolean getEstadoAsesor();// Datos que recibe el metodo de crearAsesor.
	
	String getNombreServicio();
//	void escribeAsesor(String s);	// Texto con los asesores.
	
	// Constantes que definen las posibles operaciones:

}
