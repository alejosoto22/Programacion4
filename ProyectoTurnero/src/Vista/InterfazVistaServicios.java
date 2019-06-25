package Vista;

import Controlador.ControladorServicios;

public interface InterfazVistaServicios {
	
	void setControladorServicio(ControladorServicios controlServicio);
	void arranca();
		
	String getNombreServicio();		// Datos que recibe el metodo de crearServicio.

}
