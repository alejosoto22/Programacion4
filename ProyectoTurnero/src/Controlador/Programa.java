package Controlador;

import Modelo.Asesores;
import Modelo.Servicios;
import Vista.InterfazVista;
import Vista.VistaAsesores;

import Controlador.ControladorAsesores;

public class Programa {

	public static void main(String[] args) {
		
		Asesores modeloAsesores = new Asesores();
		Servicios modeloServicios = new Servicios();
		
		InterfazVista vista = new VistaAsesores();
//		InterfazVista vistaServicios = (InterfazVista) new VistaServicios();
//		InterfazVistaServicios vistaServicios = new VistaServicios();
		
		ControladorAsesores controlAsesores = new ControladorAsesores(vista, modeloAsesores, modeloServicios);
		ControladorAsesores controlServicios = new ControladorAsesores(vista, modeloAsesores, modeloServicios);
//		ControladorServicios controlServicios = new ControladorServicios(vistaServicios, modeloServicios);
		
		vista.setControladorAsesor(controlAsesores);
		vista.setControladorAsesor(controlServicios);
//		vistaServicios.setControladorServicio(controlServicios);
		
		vista.arranca();

	}

}
