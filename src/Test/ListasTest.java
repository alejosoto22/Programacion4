package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Taller1Programacion4.Metodos;
import Taller1Programacion4.NodoTurnero;
import Taller1Programacion4.Turnero;

class ListasTest extends Turnero {
	
	@Test
	void testInsertar() {
		Metodos prueba = new Metodos();
		prueba.insertar("carlos", 002, "servicio1", 0);
		prueba.insertar("juan", 001, "servicio2", 1);
		prueba.insertar("mario", 003, "servicio1", 0);
		prueba.insertar("alejo", 005, "servicio3", 0);
		prueba.insertar("luis", 004, "servicio2", 0);
		
		String cabeza = prueba.getColaDeTurnos().getCabezaTurno().getCliente().getNombre();
		String segundo = prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getCliente().getNombre();
		String tercero = prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre();
		String cuarto = prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre();
		String quinto = prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre();
		NodoTurnero despuesDelFinal = prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno(); // SIGUIENTES.
		NodoTurnero anteriorCabeza = prueba.getColaDeTurnos().getCabezaTurno().getAnteriorTurno();
		NodoTurnero siguienteCola = prueba.getColaDeTurnos().getColaTurno().getSiguienteTurno();
		String cola = prueba.getColaDeTurnos().getColaTurno().getCliente().getNombre();
				
		assertEquals(cabeza, "carlos");
		assertEquals(segundo, "juan");
		assertEquals(tercero, "mario");
		assertEquals(cuarto, "alejo");
		assertEquals(quinto, "luis");
		assertEquals(despuesDelFinal, null);
		assertEquals(anteriorCabeza, null);
		assertEquals(siguienteCola, null);
		assertEquals(cola, "luis");
		
	}
	
	@Test
	void testInsertarOrdenado() {	// TEST DEL METODO OK

		
		Metodos prueba = new Metodos();
		NodoTurnero nodo = new NodoTurnero("carlos", 002, "servicio1", 0);
		NodoTurnero nodo2 = new NodoTurnero("luis", 002, "servicio1", 1);
		NodoTurnero nodo3 = new NodoTurnero("juan", 002, "servicio1", 0);
		NodoTurnero nodo4 = new NodoTurnero("mario", 002, "servicio1", 1);
		
		prueba.insertarOrdenado(nodo, prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad());
		prueba.insertarOrdenado(nodo2, prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad());
		prueba.insertarOrdenado(nodo3, prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad());
		prueba.insertarOrdenado(nodo4, prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad());
		
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getCliente().getNombre(), "luis");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getSiguienteTurno().getCliente().getNombre(), "mario");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "carlos");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "juan");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno(), null);
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getColaTurnoPorPrioridad().getCliente().getNombre(), "juan");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getColaTurnoPorPrioridad().getSiguienteTurno(), null);
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getAnteriorTurno(), null);
		
	}
	
	@Test
	void testTurnero() {
		Metodos prueba = new Metodos();
		prueba.turnero("carlos", 002, "servicio1", 0);
		prueba.turnero("juan", 001, "servicio2", 1);
	//	prueba.turnero("mario", 003, "servicio1", 0);
	//	prueba.turnero("alejo", 005, "servicio3", 0);
	//	prueba.turnero("luis", 004, "servicio2", 0);
		
		// TEST COLA EN ORDEN DE LLEGADA.
		String cabeza = prueba.getColaDeTurnos().getCabezaTurno().getCliente().getNombre();
		String segundo = prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getCliente().getNombre();
		String tercero = prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre();
		String cuarto = prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre();
		String quinto = prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre();
		NodoTurnero despuesDelFinal = prueba.getColaDeTurnos().getCabezaTurno(); // SIGUIENTES.
		NodoTurnero anteriorCabeza = prueba.getColaDeTurnos().getCabezaTurno().getAnteriorTurno();
		NodoTurnero siguienteCola = prueba.getColaDeTurnos().getColaTurno().getSiguienteTurno();
		String cola = prueba.getColaDeTurnos().getColaTurno().getCliente().getNombre();
		
	//	assertEquals(cabeza, "carlos");
	//	assertEquals(segundo, "juan");
	//	assertEquals(tercero, "mario");
	//	assertEquals(cuarto, "alejo");
	//	assertEquals(quinto, "luis");
	//	assertEquals(despuesDelFinal, null);
	//	assertEquals(anteriorCabeza, null);
	//	assertEquals(siguienteCola, null);
	//	assertEquals(cola, "carlos");
		
		// TEST COLA EN ORDEN DE PRIORIDAD.
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getCliente().getNombre(), "juan");
	//	assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getSiguienteTurno().getCliente().getNombre(), "carlos");
	//	assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "carlos");
	//	assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "juan");
	//	assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno(), null);
	//	assertEquals(prueba.getColaDeTurnosPorPrioridad().getColaTurnoPorPrioridad().getCliente().getNombre(), "carlos");
	//	assertEquals(prueba.getColaDeTurnosPorPrioridad().getColaTurnoPorPrioridad().getSiguienteTurno(), null);
	//	assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurnoPorPrioridad().getAnteriorTurno(), null);

	}
		
	@Test
	void testInsertarEnServicio() {
		Metodos prueba = new Metodos();
		prueba.insertar("luis", 002, "servicio1", 0);
		prueba.insertarEnServicio(prueba.getColaDeTurnos().getCabezaTurno());
		assertEquals(prueba.getColaDeTurnos().getCabezaTurno().getCliente().getNombre(), "luis");
		assertEquals(prueba.getColaDeTurnos().getCabezaTurno().getCliente().getNombre(), prueba.getListaDeServicios().getCabezaServicio().getDatoServicio().getCabezaTurno().getCliente().getNombre());
	}
	
	

}
