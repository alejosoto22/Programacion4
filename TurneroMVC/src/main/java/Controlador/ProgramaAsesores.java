package Controlador;

import Modelo.Asesores;
import Vista.InterfazVista;
import Vista.Vista;

public class ProgramaAsesores {

	public static void main(String[] args) {
		
		Asesores modelo = new Asesores();
		
		InterfazVista vista = new Vista();
		
		Controlador control = new Controlador(vista, modelo);
		
		vista.setControlador(control);
		
		vista.arranca();

	}

}
