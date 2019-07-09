package Controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Servicio;
import Modelo.Turnero;
import Modelo.Turno;
import Vista.InterfazVista;
import Vista.VistaAdministrador;
import Vista.VistaTurnero;

public class Programa {
	
//	private static EntityManager manager;
//	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		
//		emf = Persistence.createEntityManagerFactory("Persistencia");
//		manager = emf.createEntityManager();
		
		Turno modeloTurno = new Turno();
		VistaTurnero vistaTurno = new VistaTurnero();
		
		VistaAdministrador vistaAdministrador = new VistaAdministrador();
		Servicio modeloServicio = new Servicio();
		
		Controlador control = new Controlador(vistaTurno, modeloTurno);
		ControladorAdmin controlAdmin = new ControladorAdmin(vistaAdministrador, modeloServicio);
		
		
	//	Controlador control2 = new Controlador(vistaAdministrador, modeloServicio);
		
		vistaTurno.setControlador(control);
		vistaAdministrador.setControladorAdministrador(controlAdmin);
	//	modeloTurno.setControlador(control);
		
	//	control.setModeloTurno(modeloTurno);
	//	control.setVista(vistaTurno);
		
		vistaTurno.arranca();
		vistaTurno.setSize(437, 345);
		
		vistaAdministrador.arranca();
		vistaAdministrador.setSize(700, 345);
		
	}

}
