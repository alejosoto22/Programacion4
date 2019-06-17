package Modelo; // Dejarás - Kjarkas

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

	public Turnero getlistaDeTurnos() {
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
			this.colaDeTurnos.getColaTurno()
					.setConsecutivoTurno(this.colaDeTurnos.getColaTurno().getAnteriorTurno().getConsecutivoTurno() + 1);
		}
		this.colaDeTurnos.setTamañoTurno(this.colaDeTurnos.getTamañoTurno() + 1);
	}

	// METODO QUE INSERTA EN LA LISTA "colaDeTurnosPorPrioridad" ORDENANDO SEGÚN LA
	// PRIORIDAD QUE TENGA CADA CLIENTE.
/*	public void insertarOrdenado(NodoTurnero nodo, NodoTurnero nodoActual) {
		NodoTurnero nuevoNodo = new NodoTurnero();
		nuevoNodo = nodo;
		if (nodoActual == null) {
			this.colaDeTurnosPorPrioridad.setCabezaTurno(nuevoNodo);
			this.colaDeTurnosPorPrioridad.getCabezaTurno().setSiguienteTurno(null);
			this.colaDeTurnosPorPrioridad.getCabezaTurno().setAnteriorTurno(null);
			this.colaDeTurnosPorPrioridad.setColaTurno(nuevoNodo);
			this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(null);
			this.colaDeTurnosPorPrioridad.getColaTurno().setAnteriorTurno(null);
			this.colaDeTurnosPorPrioridad.getColaTurno().setConsecutivoTurno(1);
			this.colaDeTurnosPorPrioridad.getCabezaTurno().setConsecutivoTurno(1);
		} else {
			if (nodoActual != null) {
				if (nodoActual.getCliente().getPrioridad() == 0) {

					if (nuevoNodo.getCliente().getPrioridad() == 1) {
						nodoActual.setAnteriorTurno(nuevoNodo);
						nuevoNodo.setSiguienteTurno(nodoActual);
						if (nodoActual == this.colaDeTurnosPorPrioridad.getCabezaTurno()) {
							this.colaDeTurnosPorPrioridad.setCabezaTurno(nuevoNodo);
							// System.out.println("entró al primero");
						}
					} else {
						this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(nuevoNodo);
						nuevoNodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurno());
						this.colaDeTurnosPorPrioridad.setColaTurno(nuevoNodo);
						this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(null);
					}
				} else {
					if (nodoActual.getCliente().getPrioridad() == 1) {
						if (nodoActual.getSiguienteTurno() == null) {
							nodoActual.setSiguienteTurno(nuevoNodo);
							nuevoNodo.setAnteriorTurno(nodoActual);
							this.colaDeTurnosPorPrioridad.setColaTurno(nuevoNodo);
							this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(null);
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
									this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(nuevoNodo);
									nuevoNodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurno());
									this.colaDeTurnosPorPrioridad.setColaTurno(nuevoNodo);
									this.colaDeTurnosPorPrioridad.getColaTurno().setSiguienteTurno(null);
								}
							}
						}
					}
				}
			}
		}
	}*/

	public void turnero(String nombre, int id, String servicio, int prioridad) {
		NodoTurnero nuevoNodo = new NodoTurnero(nombre, id, servicio, prioridad);
		insertar(nombre, id, servicio, prioridad);
//		asignarTurno(nuevoNodo, this.colaDeTurnosPorPrioridad.getCabezaTurno());
	}

	public void insertarEnServicio(NodoTurnero nodo, NodoServicios actual) {
		if (this.listaDeServicios.getCabezaServicio() == null) {
			NodoServicios nuevoServicio = new NodoServicios();
			Turnero colaServicio = new Turnero();
			NodoTurnero nuevoNodoTurnero = new NodoTurnero();
			nuevoNodoTurnero = nodo;
			colaServicio.setCabezaTurno(nuevoNodoTurnero);
			colaServicio.setColaTurno(nuevoNodoTurnero);
			nuevoServicio.setDatoServicio(colaServicio);
			this.listaDeServicios.setCabezaServicio(nuevoServicio);
			this.listaDeServicios.setColaServicio(nuevoServicio);
			this.listaDeServicios.getCabezaServicio().setTipoServicio(nodo.getCliente().getServicio());
			this.listaDeServicios.getColaServicio().setTipoServicio(nodo.getCliente().getServicio());
			System.out.println("entró al nulo");

		} else {
			NodoTurnero nuevoNodo = new NodoTurnero();
			nuevoNodo = nodo;

			if (nuevoNodo.getCliente().getServicio() == actual.getTipoServicio()) {
				actual.getDatoServicio().getColaTurno().setSiguienteTurno(nuevoNodo);
				nuevoNodo.setAnteriorTurno(actual.getDatoServicio().getColaTurno());
				actual.getDatoServicio().setColaTurno(nuevoNodo);
			} else {
				if (actual.getSiguienteServicio() == null) {
					NodoServicios nuevoServicio = new NodoServicios();
					Turnero colaServicio = new Turnero();
					colaServicio.setCabezaTurno(nuevoNodo);
					colaServicio.setColaTurno(nuevoNodo);
					nuevoServicio.setDatoServicio(colaServicio);
					nuevoServicio.setTipoServicio(nuevoNodo.getCliente().getServicio());
					this.listaDeServicios.getColaServicio().setSiguienteServicio(nuevoServicio);
					nuevoServicio.setAnteriorServicio(this.listaDeServicios.getColaServicio());
					this.listaDeServicios.setColaServicio(nuevoServicio);
				} else {
					insertarEnServicio(nodo, actual.getSiguienteServicio());
				}

			}

		}
	}

	/*
	 * public void encolarNodo(NodoTurnero nodo, Turnero cola) { // NodoTurnero
	 * nuevoNodo = new NodoTurnero(); if (cola.getCabezaTurno() == null) {
	 * cola.setCabezaTurno(nodo); cola.setColaTurno(nodo); } else {
	 * cola.getColaTurno().setSiguienteTurno(nodo);
	 * nodo.setAnteriorTurno(cola.getColaTurno()); cola.setColaTurno(nodo); } }
	 */
}
