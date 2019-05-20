package Turnero;

public class Turnero {
	
	private NodoTurnero cabezaTurno = null;
	private NodoTurnero colaTurno = null;
	private int tamañoTurno = 0;
	
	public Turnero() {
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
