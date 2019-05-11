package Taller1Programacion4;	// Dejar�s - Kjarkas

public class Metodos {

	private Turnero colaDeTurnos = new Turnero(); 			  // DONDE SE ENCOLA A LAS PERSONAS EN ORDEN DE LLEGADA.
	private Turnero colaDeTurnosPorPrioridad = new Turnero(); // DONDE SE ENCOLA A LAS PERSONAS ORDENANDOLAS POR
															  // PRIORIDAD.
	private Servicios listaDeServicios = new Servicios(); 	  // DONDE SE ENCOLAN LAS PERSONAS POR ORDEN DE SERVICIO (EN
														      // ORDEN DE PRIORIDAD) DENTRO DE CADA NODO DE LA LISTA.
	private Asesores listaAsesores = new Asesores();

	public Asesores getListaAsesores() {
		return listaAsesores;
	}

	public void setListaAsesores(Asesores listaAsesores) {
		this.listaAsesores = listaAsesores;
	}

	public Metodos() {
	}

	public Turnero getColaDeTurnos() {
		return colaDeTurnos;
	}

	public void setColaDeTurnos(Turnero colaDeTurnos) {
		this.colaDeTurnos = colaDeTurnos;
	}

	public Servicios getListaDeServicios() {
		return listaDeServicios;
	}

	public void setListaDeServicios(Servicios listaDeServicios) {
		this.listaDeServicios = listaDeServicios;
	}

	public Turnero getColaDeTurnosPorPrioridad() {
		return colaDeTurnosPorPrioridad;
	}

	public void setColaDeTurnosPorPrioridad(Turnero colaDeTurnosPorPrioridad) {
		this.colaDeTurnosPorPrioridad = colaDeTurnosPorPrioridad;
	}

	// METODO QUE INSERTA EN LA LISTA "colaDeTurnos" EN ORDEN DE LLEGADA.
	public void insertar(String nombre, int id, String servicio, int prioridad) {
		NodoTurnero nuevoNodo = new NodoTurnero(nombre, id, servicio, prioridad);
		
		if (this.colaDeTurnos.getCabezaTurno() == null) {
			this.colaDeTurnos.setCabezaTurno(nuevoNodo);
			this.colaDeTurnos.setColaTurno(nuevoNodo);
			this.colaDeTurnos.getColaTurno().setConsecutivoTurno(1);
			this.colaDeTurnos.getCabezaTurno().setConsecutivoTurno(1);
		} else {
			this.colaDeTurnos.getColaTurno().setSiguienteTurno(nuevoNodo);
			nuevoNodo.setAnteriorTurno(this.colaDeTurnos.getColaTurno());
			this.colaDeTurnos.setColaTurno(nuevoNodo);
			this.colaDeTurnos.getColaTurno().setConsecutivoTurno(this.colaDeTurnos.getColaTurno().getAnteriorTurno().getConsecutivoTurno() + 1);
		}
		this.colaDeTurnos.setTama�oTurno(this.colaDeTurnos.getTama�oTurno() + 1);
	}

	// METODO QUE INSERTA EN LA LISTA "colaDeTurnosPorPrioridad" ORDENANDO SEG�N LA PRIORIDAD QUE TENGA CADA CLIENTE.
	public void insertarOrdenado(NodoTurnero nodo, NodoTurnero nodoActual) {
		if (nodoActual == null) {
			this.colaDeTurnosPorPrioridad.setCabezaTurnoPorPrioridad(nodo);
			this.colaDeTurnosPorPrioridad.getCabezaTurnoPorPrioridad().setSiguienteTurno(null);
			this.colaDeTurnosPorPrioridad.getCabezaTurnoPorPrioridad().setAnteriorTurno(null);
			this.colaDeTurnosPorPrioridad.setColaTurnoPorPrioridad(nodo);
			this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(null);
			this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setAnteriorTurno(null);
			this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setConsecutivoTurno(1);
			this.colaDeTurnosPorPrioridad.getCabezaTurnoPorPrioridad().setConsecutivoTurno(1);
		} else {
			if (nodoActual != null) {
				if (nodoActual.getCliente().getPrioridad() == 0) {

					if (nodo.getCliente().getPrioridad() == 1) {
						nodoActual.setAnteriorTurno(nodo);
						nodo.setSiguienteTurno(nodoActual);
						if (nodoActual == this.colaDeTurnosPorPrioridad.getCabezaTurnoPorPrioridad()) {
							this.colaDeTurnosPorPrioridad.setCabezaTurnoPorPrioridad(nodo);
							System.out.println("entr� al primero");
						}			
					} else {
						this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(nodo);
						nodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad());
						this.colaDeTurnosPorPrioridad.setColaTurnoPorPrioridad(nodo);
						this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(null);
					}
				} else {
					if (nodoActual.getCliente().getPrioridad() == 1) {
						if (nodoActual.getSiguienteTurno() == null) {
							nodoActual.setSiguienteTurno(nodo);
							nodo.setAnteriorTurno(nodoActual);
							this.colaDeTurnosPorPrioridad.setColaTurnoPorPrioridad(nodo);
							this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(null);
						} else {
							if (nodoActual.getSiguienteTurno().getCliente().getPrioridad() == 1) {
								insertarOrdenado(nodo, nodoActual.getSiguienteTurno());
							} else {
								if (nodo.getCliente().getPrioridad() == 1) {
									nodo.setAnteriorTurno(nodoActual);
									nodo.setSiguienteTurno(nodoActual.getSiguienteTurno());
									nodoActual.setSiguienteTurno(nodo);
									nodo.getSiguienteTurno().setAnteriorTurno(nodo);
								} else {
									this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(nodo);
									nodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad());
									this.colaDeTurnosPorPrioridad.setColaTurnoPorPrioridad(nodo);
									this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(null);
								}
							}
						}
					}
				}
			}
		}
	}
	
	// METODO ENCOLAR EN LA LISTA SERVICIOS
	public void insertarEnServicio(NodoTurnero nodo) {
		if (this.listaDeServicios.getCabezaServicio() == null) {
			NodoServicios nuevoServicio = new NodoServicios();
			this.listaDeServicios.setCabezaServicio(nuevoServicio);
			Turnero colaServicio = new Turnero();
			NodoTurnero nuevoNodoTurnero = new NodoTurnero();
			colaServicio.setCabezaTurno(nuevoNodoTurnero);
			colaServicio.getCabezaTurno().setCliente(nodo.getCliente());
			nuevoServicio.setDatoServicio(colaServicio);
			this.listaDeServicios.setCabezaServicio(nuevoServicio);

		}
	}

}
