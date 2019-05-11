package Taller1Programacion4;

public class Turnero {
	
	private NodoTurnero cabezaTurno = null;
	private NodoTurnero colaTurno = null;
	private NodoTurnero cabezaTurnoPorPrioridad = null;
	private NodoTurnero colaTurnoPorPrioridad = null;
	private int tamañoTurno = 0;
	
	public Turnero() {
	}
		
	public NodoTurnero getCabezaTurnoPorPrioridad() {
		return cabezaTurnoPorPrioridad;
	}

	public void setCabezaTurnoPorPrioridad(NodoTurnero cabezaTurnoPorPrioridad) {
		this.cabezaTurnoPorPrioridad = cabezaTurnoPorPrioridad;
	}

	public NodoTurnero getColaTurnoPorPrioridad() {
		return colaTurnoPorPrioridad;
	}

	public void setColaTurnoPorPrioridad(NodoTurnero colaTurnoPorPrioridad) {
		this.colaTurnoPorPrioridad = colaTurnoPorPrioridad;
	}

	public NodoTurnero getCabezaTurno() {
		return cabezaTurno;
	}

	public void setCabezaTurno(NodoTurnero cabezaTurno) {
		this.cabezaTurno = cabezaTurno;
	}

	public NodoTurnero getColaTurno() {
		return colaTurno;
	}

	public void setColaTurno(NodoTurnero colaTurno) {
		this.colaTurno = colaTurno;
	}

	public int getTamañoTurno() {
		return tamañoTurno;
	}

	public void setTamañoTurno(int tamañoTurno) {
		this.tamañoTurno = tamañoTurno;
	}
	
	
}
