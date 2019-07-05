package Controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Turnero;
import Modelo.Turno;
import Vista.InterfazVista;
import Vista.VistaTurnero;

public class Programa {
	
//	private static EntityManager manager;
//	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		
//		emf = Persistence.createEntityManagerFactory("Persistencia");
//		manager = emf.createEntityManager();
		
		Turno modeloTurno = new Turno();
		VistaTurnero vistaTurno = new VistaTurnero();
		Controlador control = new Controlador(vistaTurno, modeloTurno);
				
		vistaTurno.setControlador(control);
	//	modeloTurno.setControlador(control);
		
	//	control.setModeloTurno(modeloTurno);
	//	control.setVista(vistaTurno);
		
		vistaTurno.arranca();
	//	vistaTurno.setVisible(true);
		
	}

}
