package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Turnero.Metodos;
import Turnero.NodoTurnero;
import Turnero.Turnero;

class TestTurnero extends Turnero {
	
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
		
		prueba.insertarOrdenado(nodo, prueba.getColaDeTurnosPorPrioridad().getCabezaTurno());
		prueba.insertarOrdenado(nodo2, prueba.getColaDeTurnosPorPrioridad().getCabezaTurno());
		prueba.insertarOrdenado(nodo3, prueba.getColaDeTurnosPorPrioridad().getCabezaTurno());
		prueba.insertarOrdenado(nodo4, prueba.getColaDeTurnosPorPrioridad().getCabezaTurno());
		
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getCliente().getNombre(), "luis");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getSiguienteTurno().getCliente().getNombre(), "mario");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "carlos");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "juan");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno(), null);
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getColaTurno().getCliente().getNombre(), "juan");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getColaTurno().getSiguienteTurno(), null);
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getAnteriorTurno(), null);
		
	}
	
	@Test
	void testInsertarEnServicio() {
		Metodos prueba = new Metodos();
		NodoTurnero nodo1 = new NodoTurnero("luis", 001, "servicio1", 0);
		NodoTurnero nodo2 = new NodoTurnero("alejo", 003, "servicio2", 0);
		NodoTurnero nodo3 = new NodoTurnero("juan", 002, "servicio3", 0);
		NodoTurnero nodo4 = new NodoTurnero("carlos", 004, "servicio2", 0);
		
		prueba.insertarEnServicio(nodo1, prueba.getListaDeServicios().getCabezaServicio());
		prueba.insertarEnServicio(nodo2, prueba.getListaDeServicios().getCabezaServicio());
		prueba.insertarEnServicio(nodo3, prueba.getListaDeServicios().getCabezaServicio());
		prueba.insertarEnServicio(nodo4, prueba.getListaDeServicios().getCabezaServicio());
		
		assertEquals(prueba.getListaDeServicios().getCabezaServicio().getDatoServicio().getCabezaTurno().getCliente().getNombre(), "luis");
		assertEquals(prueba.getListaDeServicios().getCabezaServicio().getSiguienteServicio().getDatoServicio().getCabezaTurno().getCliente().getNombre(), "alejo");
		assertEquals(prueba.getListaDeServicios().getCabezaServicio().getSiguienteServicio().getDatoServicio().getColaTurno().getCliente().getNombre(), "carlos");
		assertEquals(prueba.getListaDeServicios().getColaServicio().getDatoServicio().getCabezaTurno().getCliente().getNombre(), "juan");
	
	}
	
}
