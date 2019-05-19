package Turnero;


public class NodoTurnero {
		
	private Persona cliente;
	private int consecutivoTurno = 0;
	private NodoTurnero anteriorTurno;
	private NodoTurnero siguienteTurno;
		
	public NodoTurnero() {
		
	}

	public NodoTurnero(String nombre, int id, String servicio, int prioridad) {
		this.cliente = new Persona(nombre, id, servicio, prioridad);
		
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public int getConsecutivoTurno() {
		return consecutivoTurno;
	}

	public void setConsecutivoTurno(int consecutivoTurno) {
		this.consecutivoTurno = consecutivoTurno;
	}

	public NodoTurnero getAnteriorTurno() {
		return anteriorTurno;
	}

	public void setAnteriorTurno(NodoTurnero anteriorTurno) {
		this.anteriorTurno = anteriorTurno;
	}

	public NodoTurnero getSiguienteTurno() {
		return siguienteTurno;
	}

	public void setSiguienteTurno(NodoTurnero siguienteTurno) {
		this.siguienteTurno = siguienteTurno;
	}
	
}
