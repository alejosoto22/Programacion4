package Controlador;

import Modelo.Asesores;
import Modelo.Servicios;
import Vista.InterfazVista;
import Vista.InterfazVistaServicios;
import Vista.VistaAsesores;
import Vista.VistaServicios;
import Controlador.ControladorAsesores;

public class Programa {

	public static void main(String[] args) {
		
		Asesores modeloAsesores = new Asesores();
		Servicios modeloServicios = new Servicios();
		
		InterfazVista vista = new VistaAsesores();
		InterfazVistaServicios vistaServicios = new VistaServicios();
		
		ControladorAsesores controlAsesores = new ControladorAsesores(vista, modeloAsesores);
		ControladorServicios controlServicios = new ControladorServicios(vistaServicios, modeloServicios);
		
		vista.setControladorAsesor(controlAsesores);
		vistaServicios.setControladorServicio(controlServicios);
		
		vista.arranca();

	}

}
