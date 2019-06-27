package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Asesores;
import Modelo.Servicios;
import Vista.InterfazVista;
//import modelo.Persona;

public class Controlador implements ActionListener{
	
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	
	private InterfazVista vista;
	private Asesores modelo;
	private Servicios modeloServicios;
		
	public Controlador(InterfazVista vista, Asesores modelo) {
		
		this.vista = vista;
		this.modelo = modelo;
	}
	
public Controlador(InterfazVista vista, Servicios modeloServicios) {
		
		this.vista = vista;
		this.modeloServicios = modeloServicios;
	}

	public void actionPerformed(ActionEvent evento) {
		
//		emf = Persistence.createEntityManagerFactory("Persistencia");
//		manager = emf.createEntityManager();
		
		String nombreAsesor = vista.getNombreAsesor();
		int idAsesor = vista.getIdAsesor();
		boolean estadoAsesor = vista.getEstadoAsesor();
		
		modelo.crearAsesor(nombreAsesor, idAsesor, estadoAsesor);
//		modelo.listarAserores();
		
//		manager.getTransaction().begin();
//		manager.persist(modelo.getAsesor());
		
		
//		vista.escribeAsesor("Asesor creado");
	}
	
/*	@SuppressWarnings("unchecked")
	private static void imprimirTodo() {
		List<Persona> personas = (List<Persona>) manager.createQuery("FROM Persona").getResultList();
		System.out.println("En esta Base de Datos hay " + personas.size() + " personas.");
		for(Persona person : personas) {
			System.out.println(person.toString());
		}
	}
*/
}
