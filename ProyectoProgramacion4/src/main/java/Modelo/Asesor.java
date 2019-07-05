package Modelo;

public class Asesor {
	
	private String nombreAsesor;
	private int idAsesor;
	private boolean activo;
	private boolean disponible;
	
	public Asesor() {
		super();
	}

	public Asesor(String nombreAsesor, int idAsesor, boolean activo, boolean disponible) {
		super();
		this.nombreAsesor = nombreAsesor;
		this.idAsesor = idAsesor;
		this.activo = activo;
		this.disponible = disponible;
	}

	public String getNombreAsesor() {
		return nombreAsesor;
	}

	public void setNombreAsesor(String nombreAsesor) {
		this.nombreAsesor = nombreAsesor;
	}

	public int getIdAsesor() {
		return idAsesor;
	}

	public void setIdAsesor(int idAsesor) {
		this.idAsesor = idAsesor;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	

}
