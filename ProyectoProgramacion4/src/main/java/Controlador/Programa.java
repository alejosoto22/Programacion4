package Controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Asesor;
import Modelo.Servicio;
import Modelo.Turnero;
import Modelo.Turno;
import Vista.InterfazVista;
import Vista.VistaAdministrador;
import Vista.VistaTurnero;

public class Programa {

	public static void main(String[] args) {

		Turno modeloTurno = new Turno();
		VistaTurnero vistaTurno = new VistaTurnero();
		
		VistaAdministrador vistaAdministrador = new VistaAdministrador();
		Servicio modeloServicio = new Servicio();
		Asesor modeloAsesor = new Asesor();
		
		Controlador control = new Controlador(vistaTurno, modeloTurno);
		ControladorAdmin controlAdmin = new ControladorAdmin(vistaAdministrador, modeloServicio, modeloAsesor);
				
		vistaTurno.setControlador(control);
		vistaAdministrador.setControladorAdministrador(controlAdmin);
		vistaAdministrador.setControladorAsesores(controlAdmin);
	
		vistaTurno.arranca();
		vistaTurno.setSize(437, 345);
		
		vistaAdministrador.arranca();
		vistaAdministrador.setSize(700, 345);
		
	}

}
