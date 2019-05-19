package tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Persona;

public class TestPersonas {
	//@PersistenceContext(unitName = "Persistencia")
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	
	public static void main(String[] args) {
		// Creando el gestor de Persistencia (EM).
		emf = Persistence.createEntityManagerFactory("Persistencia");
		manager = emf.createEntityManager();
		
		Persona a = new Persona("aleja", 001, "servicio 1", 0);
		Persona b = new Persona("willy", 002, "servicio 2", 1);
		Persona c = new Persona("alejo", 003, "servicio 1", 1);
		
		manager.getTransaction().begin();
		manager.persist(a);
		manager.persist(b);
		manager.persist(c);
		manager.getTransaction().commit();
		
		imprimirTodo();
						
	//	List<Persona> personas = (List<Persona>) manager.createQuery("FROM Persona").getResultList();
	//	System.out.println("En esta Base de Datos hay " + personas.size() + " personas.");

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
