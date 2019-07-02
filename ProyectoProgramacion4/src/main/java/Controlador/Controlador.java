package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Persona;
import Modelo.Turnero;
import Vista.InterfazVista;


public class Controlador implements ActionListener{
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	private InterfazVista vista;
	private Turnero modeloTurnero;
	
public Controlador(InterfazVista vista, Turnero modeloTurnero) {
		
	this.vista = vista;
	this.modeloTurnero = modeloTurnero;
	
	}


public void actionPerformed(ActionEvent evento) {
		
	String nombreTurnero = vista.getNombreTurnero();
	int idTurnero = vista.getIdTurnero();
	String servicioTurnero = vista.getServicioTurnero();
	int prioridadTurnero = vista.getPrioridadTurnero();
		
	modeloTurnero.crearTurno(nombreTurnero, idTurnero, servicioTurnero, prioridadTurnero);
	manager.getTransaction().begin();
	manager.persist(modeloTurnero.getListaTurnos().get(modeloTurnero.getListaTurnos().size()));
	manager.getTransaction().commit();
//	System.out.println(modeloTurnero.getListaTurnos().get(modeloTurnero.getListaTurnos().size()).toString());
	
}


@SuppressWarnings("unchecked")
private static void imprimirTodo() {
	List<Persona> personas = (List<Persona>) manager.createQuery("FROM Persona").getResultList();
	System.out.println("En esta Base de Datos hay " + personas.size() + " personas.");
	for(Persona person : personas) {
		System.out.println(person.toString());
	}
}
}
