package Modelo;

public class Turnero {
	
	private NodoTurnero cabezaTurno = null;
	private NodoTurnero colaTurno = null;
	private int tamañoTurno = 0;
	private Turnero listaDeTurnos = null;
		
	public Turnero() {
	}
		
	public Turnero getListaDeTurnos() {
		return listaDeTurnos;
	}

	public void setListaDeTurnos(Turnero listaDeTurnos) {
		this.listaDeTurnos = listaDeTurnos;
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
	
	public void insertarTurno(String nombre, int id, String servicio, int prioridad) {
		NodoTurnero nuevoNodo = new NodoTurnero(nombre, id, servicio, prioridad);

		if (this.cabezaTurno == null) {
			this.cabezaTurno = nuevoNodo;
			this.colaTurno = nuevoNodo;
			this.cabezaTurno.setConsecutivoTurno(1);
			this.colaTurno.setConsecutivoTurno(1);
			
		} else {this.colaTurno.setSiguienteTurno(nuevoNodo);
				nuevoNodo.setAnteriorTurno(this.colaTurno);
				this.colaTurno = nuevoNodo;
				this.colaTurno.setConsecutivoTurno(this.colaTurno.getAnteriorTurno().getConsecutivoTurno() + 1);
		}
		this.tamañoTurno = this.tamañoTurno + 1;
	}
	

	// flc
	public void asignarTurno(String nombre, int id, String servicio, int prioridad, NodoTurnero actual) {
		NodoTurnero nuevoNodo = new NodoTurnero(nombre, id, servicio, prioridad);
		NodoTurnero nodoActual = actual;
		if (this.cabezaTurno == null) {
			this.cabezaTurno = nuevoNodo;
			this.colaTurno = nuevoNodo;
			System.out.println("entró al nulo");
		} else {
			if (nodoActual != null) {
				if (nodoActual.getCliente().getPrioridad() == 0) {

					if (nuevoNodo.getCliente().getPrioridad() == 1) {
						nodoActual.setAnteriorTurno(nuevoNodo);
						nuevoNodo.setSiguienteTurno(nodoActual);
						if (nodoActual == this.cabezaTurno) {
							this.cabezaTurno = nuevoNodo;
							// System.out.println("entró al primero");
						}
					} else {
						this.colaTurno.setSiguienteTurno(nuevoNodo);
						nuevoNodo.setAnteriorTurno(this.colaTurno);
						this.colaTurno = nuevoNodo;
						this.colaTurno.setSiguienteTurno(null);
					}
				} else {
					if (nodoActual.getCliente().getPrioridad() == 1) {
						if (nodoActual.getSiguienteTurno() == null) {
							nodoActual.setSiguienteTurno(nuevoNodo);
							nuevoNodo.setAnteriorTurno(nodoActual);
							this.colaTurno = nuevoNodo;
							this.colaTurno.setSiguienteTurno(null);
						} else {
							if (nodoActual.getSiguienteTurno().getCliente().getPrioridad() == 1) {
								asignarTurno(nombre, id, servicio, prioridad, nodoActual.getSiguienteTurno());
							} else {
								if (nuevoNodo.getCliente().getPrioridad() == 1) {
									nuevoNodo.setAnteriorTurno(nodoActual);
									nuevoNodo.setSiguienteTurno(nodoActual.getSiguienteTurno());
									nodoActual.setSiguienteTurno(nuevoNodo);
									nuevoNodo.getSiguienteTurno().setAnteriorTurno(nuevoNodo);
								} else {
									this.colaTurno.setSiguienteTurno(nuevoNodo);
									nuevoNodo.setAnteriorTurno(this.colaTurno);
									this.colaTurno = nuevoNodo;
									this.colaTurno.setSiguienteTurno(null);
								}
							}
						}
					}
				}
			}
		}
		this.tamañoTurno = this.tamañoTurno + 1;
		System.out.println("lista con " + this.tamañoTurno + " nodos.");
	}
}
