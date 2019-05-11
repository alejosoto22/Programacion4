package Taller1Programacion4;

public class Servicios {
	
	private NodoServicios cabezaServicio = null;
	private NodoServicios colaServicio = null;
	private int tamañoServicio = 0;
	
	public Servicios() {
	}
	
	public NodoServicios getCabezaServicio() {
		return cabezaServicio;
	}
	public void setCabezaServicio(NodoServicios cabezaServicio) {
		this.cabezaServicio = cabezaServicio;
	}
	public NodoServicios getColaServicio() {
		return colaServicio;
	}
	public void setColaServicio(NodoServicios colaServicio) {
		this.colaServicio = colaServicio;
	}
	public int getTamañoServicio() {
		return tamañoServicio;
	}
	public void setTamañoServicio(int tamañoServicio) {
		this.tamañoServicio = tamañoServicio;
	}
	
}

/*
  	public void encolarTurno(String nombre, int id, String servicio, int prioridad) {
		NodoTurnero nuevoNodo = new NodoTurnero(nombre, id, servicio, prioridad);
		buscar0(nuevoNodo, this.colaDeTurnosPorPrioridad.getCabezaTurno());

		if (this.colaDeTurnos.getCabezaTurno() == null) {
			this.colaDeTurnos.setCabezaTurno(nuevoNodo);
			this.colaDeTurnos.setColaTurno(nuevoNodo);
			this.colaDeTurnos.getColaTurno().setConsecutivoTurno(1);
			this.colaDeTurnos.getCabezaTurno().setConsecutivoTurno(1);
		} else {
			this.colaDeTurnos.getColaTurno().setSiguienteTurno(nuevoNodo);
			nuevoNodo.setAnteriorTurno(this.colaDeTurnos.getColaTurno());
			this.colaDeTurnos.setColaTurno(nuevoNodo);
			this.colaDeTurnos.getColaTurno().setSiguienteTurno(null);
			this.colaDeTurnos.getColaTurno().setConsecutivoTurno(this.colaDeTurnos.getColaTurno().getAnteriorTurno().getConsecutivoTurno() + 1);
		}
		this.colaDeTurnos.setTamañoTurno(this.colaDeTurnos.getTamañoTurno() + 1);
	}

	public void buscar0(NodoTurnero nodo, NodoTurnero nodoActual) {
		if (nodoActual == null) {
			this.colaDeTurnosPorPrioridad.setCabezaTurnoPorPrioridad(nodo);
			this.colaDeTurnosPorPrioridad.setColaTurnoPorPrioridad(nodo);
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
						}
					} else {
						this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(nodo);
						nodo.setAnteriorTurno(this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad());
						this.colaDeTurnosPorPrioridad.setColaTurnoPorPrioridad(nodo);
		//				this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(null);
					}
				} else {
					if (nodoActual.getCliente().getPrioridad() == 1) {
						if (nodoActual.getSiguienteTurno() == null) {
							nodoActual.setSiguienteTurno(nodo);
							nodo.setAnteriorTurno(nodoActual);
							this.colaDeTurnosPorPrioridad.setColaTurnoPorPrioridad(nodo);
		//					this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(null);
						} else {
							if (nodoActual.getSiguienteTurno().getCliente().getPrioridad() == 1) {
								buscar0(nodo, nodoActual.getSiguienteTurno());
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
		//							this.colaDeTurnosPorPrioridad.getColaTurnoPorPrioridad().setSiguienteTurno(null);
								}
							}
						}
					}
				}
			}
		}
	}
 */
