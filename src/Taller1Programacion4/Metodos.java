package Taller1Programacion4;

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
	public void encolarTurno(String nombre, int id, String servicio, int prioridad) {
		NodoTurnero nuevoNodo = new NodoTurnero(nombre, id, servicio, prioridad);
		buscar0(nuevoNodo, this.colaDeTurnosPorPrioridad.getCabezaTurno());
//		asignarOrdenandoPorPrioridad(nombre, id, servicio, prioridad);

		if (this.colaDeTurnos.getCabezaTurno() == null) {
			this.colaDeTurnos.setCabezaTurno(nuevoNodo);
			this.colaDeTurnos.setColaTurno(nuevoNodo);
			this.colaDeTurnos.getColaTurno().setConsecutivoTurno(1);
			this.colaDeTurnos.getCabezaTurno().setConsecutivoTurno(1);
		} else {
			this.colaDeTurnos.getColaTurno().setSiguienteTurno(nuevoNodo);
			nuevoNodo.setAnteriorTurno(this.colaDeTurnos.getColaTurno());
			this.colaDeTurnos.setColaTurno(nuevoNodo);
			this.colaDeTurnos.getColaTurno()
					.setConsecutivoTurno(this.colaDeTurnos.getColaTurno().getAnteriorTurno().getConsecutivoTurno() + 1);
		}
		this.colaDeTurnos.setTamañoTurno(this.colaDeTurnos.getTamañoTurno() + 1);
	}

	public void buscar0(NodoTurnero nodo, NodoTurnero nodoActual) {
		if (nodoActual == null) {
			this.colaDeTurnosPorPrioridad.setCabezaTurno(nodo);
		//	this.colaDeTurnosPorPrioridad.getCabezaTurno().setAnteriorTurno(null);
			this.colaDeTurnosPorPrioridad.setColaTurno(nodo);
			this.colaDeTurnosPorPrioridad.getColaTurno().setConsecutivoTurno(1);
			this.colaDeTurnosPorPrioridad.getCabezaTurno().setConsecutivoTurno(1);
		} else {
			if (nodoActual.getCliente().getPrioridad() == 0) {

				if (nodo.getCliente().getPrioridad() == 1) {
					nodoActual.setAnteriorTurno(nodo);
					nodo.setSiguienteTurno(nodoActual);
					this.colaDeTurnosPorPrioridad.setCabezaTurno(nodo);
					this.colaDeTurnosPorPrioridad.getCabezaTurno().setAnteriorTurno(null);
				} else {
					this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(nodo);
					nodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurno());
					this.colaDeTurnosPorPrioridad.setColaTurno(nodo);
					this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(null);
					if(nodoActual.getSiguienteTurno().getSiguienteTurno().getCliente().getId() == nodoActual.getCliente().getId()) {
						nodoActual.getSiguienteTurno().setSiguienteTurno(null);
					}
				}
			} else {if (nodoActual.getCliente().getPrioridad() == 1) {
						if (nodoActual.getSiguienteTurno() == null) {
							nodoActual.setSiguienteTurno(nodo);
							nodo.setAnteriorTurno(nodoActual);
							this.colaDeTurnosPorPrioridad.setColaTurno(nodo);
							this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(null);
						} else {
								if (nodoActual.getSiguienteTurno().getCliente().getPrioridad() == 0) {
									if (nodo.getCliente().getPrioridad() == 1) {
										nodo.setAnteriorTurno(nodoActual);
										nodo.setSiguienteTurno(nodoActual.getSiguienteTurno());
										nodoActual.setSiguienteTurno(nodo);
										nodo.getSiguienteTurno().setAnteriorTurno(nodo);

							} else {
								this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(nodo);
								nodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurno());
								this.colaDeTurnosPorPrioridad.setColaTurno(nodo);
								this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(null);
							}
						} else {
				//			if (nodoActual.getSiguienteTurno().getCliente().getPrioridad() == 1) {
								buscar0(nodo, nodoActual.getSiguienteTurno());
							}
							// System.out.println("error");
			//			}
					}
				}
			}
		}
	}

	/*
	 * if
	 * (this.colaDeTurnosPorPrioridad.getCabezaTurno().getCliente().getPrioridad()
	 * == 0) {
	 * 
	 * if (nodo.getCliente().getPrioridad() == 1) {
	 * this.colaDeTurnosPorPrioridad.getCabezaTurno().setAnteriorTurno(nodo);
	 * nodo.setSiguienteTurno(this.colaDeTurnosPorPrioridad.getCabezaTurno());
	 * this.colaDeTurnosPorPrioridad.setCabezaTurno(nodo); } else
	 * {this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(nodo);
	 * nodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurno());
	 * this.colaDeTurnosPorPrioridad.setColaTurno(nodo); } }else {
	 * if(this.colaDeTurnosPorPrioridad.getCabezaTurno().getCliente().getPrioridad()
	 * == 1) { if
	 * (this.colaDeTurnosPorPrioridad.getCabezaTurno().getSiguienteTurno() == null)
	 * { this.colaDeTurnosPorPrioridad.getCabezaTurno().setSiguienteTurno(nodo);
	 * nodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getCabezaTurno());
	 * this.colaDeTurnosPorPrioridad.setColaTurno(nodo); } else {
	 * if(this.colaDeTurnosPorPrioridad.getCabezaTurno().getSiguienteTurno().
	 * getCliente().getPrioridad() == 0) { if (nodo.getCliente().getPrioridad() ==
	 * 1) { this.colaDeTurnosPorPrioridad.getCabezaTurno().setAnteriorTurno(nodo);
	 * nodo.setSiguienteTurno(this.colaDeTurnosPorPrioridad.getCabezaTurno());
	 * this.colaDeTurnosPorPrioridad.setCabezaTurno(nodo); } else
	 * {this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(nodo);
	 * nodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurno());
	 * this.colaDeTurnosPorPrioridad.setColaTurno(nodo); }
	 * 
	 * if (nodoActual.getSiguienteTurno().getCliente().getPrioridad() == 1) {
	 * buscar0(nodo, nodoActual.getSiguienteTurno()); } else { if
	 * (nodoActual.getSiguienteTurno().getCliente().getPrioridad() == 0) { if
	 * (nodo.getCliente().getPrioridad() == 1) { nodo.setAnteriorTurno(nodoActual);
	 * nodo.setSiguienteTurno(nodoActual.getSiguienteTurno());
	 * nodo.getSiguienteTurno().setAnteriorTurno(nodo);
	 * nodoActual.setSiguienteTurno(nodo); } else { if
	 * (nodo.getCliente().getPrioridad() == 0) {
	 * this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(nodo);
	 * nodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurno());
	 * this.colaDeTurnosPorPrioridad.setColaTurno(nodo);
	 * 
	 * System.out.println("error"); } } } } } } } } }
	 */

	// ESTE METODO ENCOLA EN LA LISTA "colaDeTurnosPorPrioridad" CON LA CUAL SE
	// ATENDERÁ A LOS CLIENTES.
	public void asignarOrdenandoPorPrioridad(String nombre, int id, String servicio, int prioridad) {
		NodoTurnero nuevoNodo = new NodoTurnero(nombre, id, servicio, prioridad);
		if (this.colaDeTurnosPorPrioridad.getCabezaTurno() == null) {

			this.colaDeTurnosPorPrioridad.setCabezaTurno(nuevoNodo);
			this.colaDeTurnosPorPrioridad.setColaTurno(nuevoNodo);
			this.colaDeTurnosPorPrioridad.getColaTurno().setConsecutivoTurno(1);
			this.colaDeTurnosPorPrioridad.getCabezaTurno().setConsecutivoTurno(1);
		} else {
			if (nuevoNodo.getCliente().getPrioridad() <= this.colaDeTurnosPorPrioridad.getColaTurno().getCliente()
					.getPrioridad()) {
				this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(nuevoNodo);
				nuevoNodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurno());
				this.colaDeTurnosPorPrioridad.setColaTurno(nuevoNodo);
				this.colaDeTurnosPorPrioridad.getColaTurno().setConsecutivoTurno(
						this.colaDeTurnosPorPrioridad.getColaTurno().getAnteriorTurno().getConsecutivoTurno() + 1);
			} else {
				buscar0(nuevoNodo, this.colaDeTurnosPorPrioridad.getCabezaTurno());
				this.colaDeTurnos.getColaTurno().setConsecutivoTurno(
						this.colaDeTurnos.getColaTurno().getAnteriorTurno().getConsecutivoTurno() + 1);
			}
		}
		this.colaDeTurnos.setTamañoTurno(this.colaDeTurnos.getTamañoTurno() + 1);
		this.colaDeTurnosPorPrioridad.setTamañoTurno(this.colaDeTurnosPorPrioridad.getTamañoTurno() + 1);
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
