import Controlador.ControlConversor;
import Modelo.ConversorEurosPesetas;
import Vista.InterfazVista;
import Vista.VentanaConversor;

public class ProgramaDeConversion {

	public static void main(String[] args) {
		
		// El Modelo:
		ConversorEurosPesetas modelo = new ConversorEurosPesetas();
		
		// La Vista:
		InterfazVista vista = new VentanaConversor();
		
		// El Control:
		ControlConversor control = new ControlConversor(vista, modelo);
		
		// Configurar la Vista:
		vista.setControlador(control);
		
		// Arranca la interfaz (vista):
		vista.arranca();

	}

}
