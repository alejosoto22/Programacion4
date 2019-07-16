package Controlador;

import Modelo.Asesor;
import Modelo.PuestoAtencion;
import Modelo.Servicio;
import Modelo.Turno;
import Vista.VistaAdministrador;
import Vista.VistaAtender;
import Vista.VistaTurno;

public class Programa {

	public static void main(String[] args) {
				
		VistaAdministrador vistaAdministrador = new VistaAdministrador();
		VistaTurno vistaTurno = new VistaTurno();
		VistaAtender vistaAsesor = new VistaAtender();
		
		Servicio modeloServicio = new Servicio();
		Asesor modeloAsesor = new Asesor();
		PuestoAtencion modeloPuesto = new PuestoAtencion();
		Turno modeloTurno = new Turno();
				
		
		ControladorAdmin controlAdmin = new ControladorAdmin(vistaAdministrador, vistaTurno, vistaAsesor, modeloServicio, modeloAsesor, modeloPuesto, modeloTurno);
		
		
		vistaAdministrador.setControladorAdministrador(controlAdmin);
		vistaAdministrador.setControladorAsesores(controlAdmin);
		vistaAdministrador.setControladorPuestos(controlAdmin);
		vistaTurno.setControladorTurno(controlAdmin);
		vistaAsesor.setControladorAsesor(controlAdmin);
	

		vistaAdministrador.arranca();
		vistaAdministrador.setSize(700, 345);
		vistaAdministrador.setLocation(600,10);
		
		vistaAsesor.arranca();
		vistaAsesor.setSize(254, 245);
		vistaAsesor.setLocation(110, 350);
		
	
		vistaTurno.arranca();
		vistaTurno.setSize(497, 345);
		vistaTurno.setLocation(110, 10);
		
	}

}
