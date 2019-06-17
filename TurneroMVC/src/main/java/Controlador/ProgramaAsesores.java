package Controlador;

import Modelo.Asesores;
import Vista.InterfazVista;
import Vista.VistaAsesores;


public class ProgramaAsesores {

	public static void main(String[] args) {
		
		Asesores modelo = new Asesores();
		
		InterfazVista vista = new VistaAsesores();
		
		Controlador control = new Controlador(vista, modelo);
		
		vista.setControlador(control);
		
		vista.arranca();

	}

}
