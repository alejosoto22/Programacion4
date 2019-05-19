package Turnero;	// Dejarás - Kjarkas

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
		this.colaDeTurnos.setTamañoTurno(this.colaDeTurnos.getTamañoTurno() + 1);
	}

	// METODO QUE INSERTA EN LA LISTA "colaDeTurnosPorPrioridad" ORDENANDO SEGÚN LA PRIORIDAD QUE TENGA CADA CLIENTE.
	public void insertarOrdenado(NodoTurnero nodo, NodoTurnero nodoActual) {
		NodoTurnero nuevoNodo = new NodoTurnero();
		nuevoNodo = nodo;
		if (nodoActual == null) {
			this.colaDeTurnosPorPrioridad.setCabezaTurnoPorPrioridad(nuevoNodo);
			this.colaDeTurnosPorPrioridad.getCabezaTurnoPorPrioridad().setSiguienteTurno(null);
			this.colaDeTurnosPorPrioridad.getCabezaTurnoPorPrioridad().setAnteriorTurno(null);
			this.colaDeTurnosPorPrioridad.setColaTurnoPorPrioridad(nuevoNodo);
			this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(null);
			this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setAnteriorTurno(null);
			this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setConsecutivoTurno(1);
			this.colaDeTurnosPorPrioridad.getCabezaTurnoPorPrioridad().setConsecutivoTurno(1);
		} else {
			if (nodoActual != null) {
				if (nodoActual.getCliente().getPrioridad() == 0) {

					if (nuevoNodo.getCliente().getPrioridad() == 1) {
						nodoActual.setAnteriorTurno(nuevoNodo);
						nuevoNodo.setSiguienteTurno(nodoActual);
						if (nodoActual == this.colaDeTurnosPorPrioridad.getCabezaTurnoPorPrioridad()) {
							this.colaDeTurnosPorPrioridad.setCabezaTurnoPorPrioridad(nuevoNodo);
						//	System.out.println("entró al primero");
						}			
					} else {
						this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(nuevoNodo);
						nuevoNodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad());
						this.colaDeTurnosPorPrioridad.setColaTurnoPorPrioridad(nuevoNodo);
						this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(null);
					}
				} else {
					if (nodoActual.getCliente().getPrioridad() == 1) {
						if (nodoActual.getSiguienteTurno() == null) {
							nodoActual.setSiguienteTurno(nuevoNodo);
							nuevoNodo.setAnteriorTurno(nodoActual);
							this.colaDeTurnosPorPrioridad.setColaTurnoPorPrioridad(nuevoNodo);
							this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(null);
						} else {
							if (nodoActual.getSiguienteTurno().getCliente().getPrioridad() == 1) {
								insertarOrdenado(nuevoNodo, nodoActual.getSiguienteTurno());
							} else {
								if (nuevoNodo.getCliente().getPrioridad() == 1) {
									nuevoNodo.setAnteriorTurno(nodoActual);
									nuevoNodo.setSiguienteTurno(nodoActual.getSiguienteTurno());
									nodoActual.setSiguienteTurno(nuevoNodo);
									nuevoNodo.getSiguienteTurno().setAnteriorTurno(nuevoNodo);
								} else {
									this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(nuevoNodo);
									nuevoNodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad());
									this.colaDeTurnosPorPrioridad.setColaTurnoPorPrioridad(nuevoNodo);
									this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(null);
								}
							}
						}
					}
				}
			}
		}
	}
	
	public void turnero(String nombre, int id, String servicio, int prioridad) {
		NodoTurnero nuevoNodo = new NodoTurnero(nombre, id, servicio, prioridad);
		insertar(nombre, id, servicio, prioridad);
		insertarOrdenado(nuevoNodo, this.colaDeTurnosPorPrioridad.getCabezaTurnoPorPrioridad());
	}
	
	// METODO ENCOLAR EN LA LISTA SERVICIOS
/*	public void insertarEnServicio(NodoTurnero nodo) {
		if (this.listaDeServicios.getCabezaServicio() == null) {
			NodoServicios nuevoServicio = new NodoServicios();
			
			Turnero colaServicio = new Turnero();
			NodoTurnero nuevoNodoTurnero = new NodoTurnero();
			colaServicio.setCabezaTurno(nuevoNodoTurnero);
			colaServicio.getCabezaTurno().setCliente(nodo.getCliente());
			nuevoServicio.setDatoServicio(colaServicio);
			this.listaDeServicios.setCabezaServicio(nuevoServicio);

		}
	}*/
	
	public void insertarEnServicio(NodoTurnero nodo) {
		if (this.listaDeServicios.getCabezaServicio() == null) {
			NodoServicios nuevoServicio = new NodoServicios();
			
			Turnero colaServicio = new Turnero();
			NodoTurnero nuevoNodoTurnero = new NodoTurnero();
			nuevoNodoTurnero = nodo;
			colaServicio.setCabezaTurno(nuevoNodoTurnero);
			colaServicio.getCabezaTurno().setCliente(nodo.getCliente());
			nuevoServicio.setDatoServicio(colaServicio);
			this.listaDeServicios.setCabezaServicio(nuevoServicio);

		}
	}
	
	
	
	
	
	
	

}
