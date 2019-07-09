import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Servicio;
import Modelo.Turno;

class TestTurnero {
	
	@Test
	void testTurnos() {
		Turno prueba = new Turno();
		prueba.crearTurno("alejo", 22, "servicio1", 1);
		prueba.crearTurno("jose", 33, "servicio2", 0);
		
		assertEquals(prueba.getListaTurnos().get(0).getNombre(), "alejo");
		assertEquals(prueba.getListaTurnos().get(1).getPrioridad(), 0);
	}

/*	@Test
	void testServicios() {
		Servicio prueba = new Servicio();
		prueba.crearServicio("servicio1");
		prueba.crearServicio("servicio2");
		
		assertEquals(prueba.getListaServi().get(0).getNombre(), "servicio1");
		assertEquals(prueba.getListaServi().get(1).getNombre(), "servicio2");
	}
*/
}
