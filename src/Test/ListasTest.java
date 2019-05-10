package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Taller1Programacion4.Metodos;
import Taller1Programacion4.NodoTurnero;
import Taller1Programacion4.Turnero;

class ListasTest extends Turnero {
	
	@Test
	void testEncolarTurno() {
		Metodos prueba = new Metodos();
		prueba.encolarTurno("carlos", 002, "servicio1", 0);
		prueba.encolarTurno("juan", 001, "servicio2", 1);
//		prueba.encolarTurno("mario", 003, "servicio1", 0);
//		prueba.encolarTurno("alejo", 005, "servicio3", 0);
//		prueba.encolarTurno("luis", 004, "servicio2", 0);
		
//		assertEquals(prueba.getColaDeTurnos().getCabezaTurno().getCliente().getNombre(), "carlos");
//		assertEquals(prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getCliente().getNombre(), "juan");
//		assertEquals(prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "mario");
//		assertEquals(prueba.getColaDeTurnos().getColaTurno().getCliente().getNombre(), "alejo");
		
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getCliente().getNombre(), "juan");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getSiguienteTurno().getCliente().getNombre(), "carlos");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getSiguienteTurno().getAnteriorTurno().getCliente().getNombre(), "juan");
//		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "carlos");
//		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "alejo");
//		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "luis");
//		assertEquals(prueba.getColaDeTurnosPorPrioridad().getColaTurno().getCliente().getNombre(), "carlos");
//		assertEquals(prueba.getColaDeTurnosPorPrioridad().getColaTurno().getSiguienteTurno().getCliente().getNombre(), "juan");
//		assertEquals(prueba.getColaDeTurnosPorPrioridad().getColaTurno().getAnteriorTurno().getCliente().getNombre(), "juan");		
	}
	
/*	@Test
	void testBuscar0() {
		Metodos prueba = new Metodos();
		prueba.encolarTurno("carlos", 002, "servicio1", 0);
		prueba.encolarTurno("juan", 001, "servicio2", 0);
//		prueba.encolarTurno("mario", 003, "servicio1", 0);
//		prueba.encolarTurno("alejo", 005, "servicio3", 1);
		
		NodoTurnero nuevo = new NodoTurnero("mateo", 002, "servicio1", 1);
		prueba.buscar0(nuevo, prueba.getColaDeTurnosPorPrioridad().getCabezaTurno());
		
		assertEquals(prueba.getColaDeTurnos().getCabezaTurno().getCliente().getNombre(), "carlos");
		assertEquals(prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getCliente().getNombre(), "juan");
		assertEquals(prueba.getColaDeTurnos().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "mario");
		assertEquals(prueba.getColaDeTurnos().getColaTurno().getCliente().getNombre(), "alejo");
				
		
	}
*/
	@Test
	void testAsignarOrdenandoPorPrioridad() {
		Metodos prueba = new Metodos();
		prueba.asignarOrdenandoPorPrioridad("carlos", 002, "servicio1", 0);
		prueba.asignarOrdenandoPorPrioridad("juan", 001, "servicio2", 0);
		prueba.asignarOrdenandoPorPrioridad("mario", 003, "servicio1", 1);
	//	prueba.asignarOrdenandoPorPrioridad("alejo", 005, "servicio3", 1);
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getCliente().getNombre(), "carlos");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getSiguienteTurno().getCliente().getNombre(), "juan");
	//	assertEquals(prueba.getColaDeTurnosPorPrioridad().getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "juan");
		assertEquals(prueba.getColaDeTurnosPorPrioridad().getColaTurno().getCliente().getNombre(), "juan");
	}
	
	
	
	@Test
	void testInsertarEnServicio() {
		Metodos prueba = new Metodos();
		prueba.encolarTurno("luis", 002, "servicio1", 0);
		prueba.insertarEnServicio(prueba.getColaDeTurnos().getCabezaTurno());
		assertEquals(prueba.getColaDeTurnos().getCabezaTurno().getCliente().getNombre(), "luis");
		assertEquals(prueba.getColaDeTurnos().getCabezaTurno().getCliente().getNombre(), prueba.getListaDeServicios().getCabezaServicio().getDatoServicio().getCabezaTurno().getCliente().getNombre());
	}
	
	

}
