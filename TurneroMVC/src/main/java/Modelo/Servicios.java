package Modelo;

public class Servicios {
	
/*	private NodoServicios cabezaServicio = null;
	private NodoServicios colaServicio = null;
	private int tama�oServicio = 0;
	private Servicios listaDeServicios;
	
	public Servicios() {
		super();
	}

	public Servicios(String nombreServicio) {
		
	}
	
	public Servicios getListaDeServicios() {
		return listaDeServicios;
	}

	public void setListaDeServicios(Servicios listaDeServicios) {
		this.listaDeServicios = listaDeServicios;
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
	public int getTama�oServicio() {
		return tama�oServicio;
	}
	public void setTama�oServicio(int tama�oServicio) {
		this.tama�oServicio = tama�oServicio;
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
			System.out.println("entr� al nulo");

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
*/	
}
