package TestTurnero;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Modelo.Turnero;

public class TestTurnero {

	@Test
	public void testInsertarTurno() {	// TEST DEL METODO OK
		
	Turnero prueba = new Turnero();
	
	prueba.insertarTurno("carlos", 002, "servicio1", 0);
	prueba.insertarTurno("alejo", 001, "servicio3", 1);
			
	assertEquals(prueba.getCabezaTurno().getCliente().getNombre(), "carlos");
	assertEquals(prueba.getCabezaTurno().getSiguienteTurno().getCliente().getNombre(), "alejo");
	assertEquals(prueba.getColaTurno().getCliente().getNombre(), "alejo");
		
	}
	
	@Test
	void testAsignarTurno() {	// TEST DEL METODO OK
				
		Turnero prueba = new Turnero();

		prueba.asignarTurno("carlos", 002, "servicio1", 0, prueba.getCabezaTurno());
//		prueba.asignarTurno("alejo", 001, "servicio3", 1, prueba.getCabezaTurno());
//		prueba.asignarTurno("juan", 002, "servicio2", 0, prueba.getCabezaTurno());
//		prueba.asignarTurno("luis", 001, "servicio3", 1, prueba.getCabezaTurno());
				
		assertEquals(prueba.getCabezaTurno().getCliente().getNombre(), "alejo");
//		assertEquals(prueba.getCabezaTurno().getSiguienteTurno().getCliente().getNombre(), "luis");
//		assertEquals(prueba.getCabezaTurno().getSiguienteTurno().getSiguienteTurno().getCliente().getNombre(), "carlos");
//		assertEquals(prueba.getColaTurno().getCliente().getNombre(), "juan");
//		assertEquals(prueba.getTamañoTurno(), 4);
	}
}
