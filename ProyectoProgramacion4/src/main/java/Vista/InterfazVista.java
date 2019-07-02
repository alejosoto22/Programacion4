package Vista;

import Controlador.Controlador;

public interface InterfazVista {
	
	void setControlador(Controlador control);
	void arranca();
	
	String getNombreTurnero();
	int getIdTurnero();
	String getServicioTurnero();
	int getPrioridadTurnero();

}
