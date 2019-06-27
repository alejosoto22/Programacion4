package Controlador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Asesores;
import Modelo.Persona;
import Modelo.Servicios;
import Vista.InterfazVista;
import Vista.VistaAsesores;
import Vista.VistaServicios;


public class ProgramaTurnero {
		
	public static void main(String[] args) {
		
		Asesores modelo = new Asesores();
		Servicios modeloServicios = new Servicios();
		
		InterfazVista vista = new VistaAsesores();
		InterfazVista vista2 = new VistaServicios();
		
		Controlador control = new Controlador(vista, modelo);
		Controlador controlServicios = new Controlador(vista2, modeloServicios);
		
		vista.setControlador(control);
		vista.setControlador(controlServicios);
		
		vista.arranca();
				
		
	//	manager = emf.createEntityManager();
	//	crearPersona();
	//	imprimir();
	}
	
/*	private static void crearPersona() {
		
		Persona person = new Persona("ALEJO", 22);
		
		manager.getTransaction().begin();
		manager.persist(person);
		
		manager.getTransaction().commit();
	}
	*/
/*	@SuppressWarnings("unchecked")
	private static void imprimir() {
		List<Persona> personas = (List<Persona>) manager.createQuery("FROM Persona").getResultList();
		System.out.println("En esta Base de Datos hay " + personas.size() + " personas.");
		for(Persona person : personas) {
			System.out.println(person.toString());
		}
	}
*/
}
