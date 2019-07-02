package Controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Turnero;
import Vista.InterfazVista;
import Vista.VistaTurnero;

public class Programa {
	
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		
		emf = Persistence.createEntityManagerFactory("Persistencia");
		manager = emf.createEntityManager();
		
		Turnero modelo = new Turnero();
		InterfazVista vistaTurnero = new VistaTurnero();
		
		Controlador control = new Controlador(vistaTurnero, modelo);
		vistaTurnero.setControlador(control);
		vistaTurnero.arranca();
		
	}

}
