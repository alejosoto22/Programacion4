package Vista;

import Controlador.ControlConversor;

public interface InterfazVista {
	
	void setControlador(ControlConversor c);
	void arranca();	// Comienza la visualización.
	
	double getCantidad();			// Cantidad a convertir.
	void escribeCambio(String s);	// Texto con la conversión.
	
	// Constantes que definen las posibles operaciones:
	static final String AEUROS = " Pesetas a Euros";
	static final String APESETAS = " Euros a Pesetas";

}
