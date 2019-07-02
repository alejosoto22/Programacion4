package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
	manager.persist(modeloTurnero);
	manager.getTransaction().commit();
}

}
