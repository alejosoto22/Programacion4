package Taller1Programacion4;	// Dejarás - Kjarkas

public class Metodos {

	private Turnero colaDeTurnos = new Turnero(); // DONDE SE ENCOLA A LAS PERSONAS EN ORDEN DE LLEGADA.
	private Turnero colaDeTurnosPorPrioridad = new Turnero(); // DONDE SE ENCOLA A LAS PERSONAS ORDENANDOLAS POR
																// PRIORIDAD.
	private Servicios listaDeServicios = new Servicios(); // DONDE SE ENCOLAN LAS PERSONAS POR ORDEN DE SERVICIO (EN
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

	// METODO QUE LLENA LAS LOS LISTAS "colaDeTurnos" Y "colaDeTurnosPorPrioridad"
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
	//		this.colaDeTurnos.getColaTurno().setSiguienteTurno(null);
			this.colaDeTurnos.getColaTurno().setConsecutivoTurno(this.colaDeTurnos.getColaTurno().getAnteriorTurno().getConsecutivoTurno() + 1);
		}
		this.colaDeTurnos.setTamañoTurno(this.colaDeTurnos.getTamañoTurno() + 1);
		this.colaDeTurnosPorPrioridad.setTamañoTurno(this.colaDeTurnosPorPrioridad.getTamañoTurno() + 1);
	}

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
							System.out.println("entró al primero");
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

	// ESTE METODO ENCOLA EN LA LISTA "colaDeTurnosPorPrioridad" CON LA CUAL SE
	// ATENDERÁ A LOS CLIENTES.
	/*
	 * public void asignarOrdenandoPorPrioridad(String nombre, int id, String
	 * servicio, int prioridad) { NodoTurnero nuevoNodo = new NodoTurnero(nombre,
	 * id, servicio, prioridad); if (this.colaDeTurnosPorPrioridad.getCabezaTurno()
	 * == null) {
	 * 
	 * this.colaDeTurnosPorPrioridad.setCabezaTurno(nuevoNodo);
	 * this.colaDeTurnosPorPrioridad.setColaTurno(nuevoNodo);
	 * this.colaDeTurnosPorPrioridad.getColaTurno().setConsecutivoTurno(1);
	 * this.colaDeTurnosPorPrioridad.getCabezaTurno().setConsecutivoTurno(1); } else
	 * { if (nuevoNodo.getCliente().getPrioridad() <=
	 * this.colaDeTurnosPorPrioridad.getColaTurno().getCliente() .getPrioridad()) {
	 * this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(nuevoNodo);
	 * nuevoNodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurno());
	 * this.colaDeTurnosPorPrioridad.setColaTurno(nuevoNodo);
	 * this.colaDeTurnosPorPrioridad.getColaTurno().setConsecutivoTurno(
	 * this.colaDeTurnosPorPrioridad.getColaTurno().getAnteriorTurno().
	 * getConsecutivoTurno() + 1); } else { buscar0(nuevoNodo,
	 * this.colaDeTurnosPorPrioridad.getCabezaTurno());
	 * this.colaDeTurnos.getColaTurno().setConsecutivoTurno(
	 * this.colaDeTurnos.getColaTurno().getAnteriorTurno().getConsecutivoTurno() +
	 * 1); } } this.colaDeTurnos.setTamañoTurno(this.colaDeTurnos.getTamañoTurno() +
	 * 1);
	 * this.colaDeTurnosPorPrioridad.setTamañoTurno(this.colaDeTurnosPorPrioridad.
	 * getTamañoTurno() + 1); }
	 * 
	 * 
	 * public void encolarTurno(String nombre, int id, String servicio, int prioridad) {
		NodoTurnero nuevoNodo = new NodoTurnero(nombre, id, servicio, prioridad);
		nuevoNodo.setSiguienteTurno(null);
		nuevoNodo.setAnteriorTurno(null);
		insertarOrdenado(nuevoNodo, this.colaDeTurnosPorPrioridad.getCabezaTurnoPorPrioridad());

		if (this.colaDeTurnos.getCabezaTurno() == null) {
			this.colaDeTurnos.setCabezaTurno(nuevoNodo);
			this.colaDeTurnos.setColaTurno(nuevoNodo);
			this.colaDeTurnos.getColaTurno().setConsecutivoTurno(1);
			this.colaDeTurnos.getCabezaTurno().setConsecutivoTurno(1);
		} else {
			this.colaDeTurnos.getColaTurno().setSiguienteTurno(nuevoNodo);
			nuevoNodo.setAnteriorTurno(this.colaDeTurnos.getColaTurno());
			this.colaDeTurnos.setColaTurno(nuevoNodo);
	//		this.colaDeTurnos.getColaTurno().setSiguienteTurno(null);
			this.colaDeTurnos.getColaTurno().setConsecutivoTurno(this.colaDeTurnos.getColaTurno().getAnteriorTurno().getConsecutivoTurno() + 1);
		}
		this.colaDeTurnos.setTamañoTurno(this.colaDeTurnos.getTamañoTurno() + 1);
		this.colaDeTurnosPorPrioridad.setTamañoTurno(this.colaDeTurnosPorPrioridad.getTamañoTurno() + 1);
	}
	 */

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
