package ttps.spring.model2019;

import java.io.Serializable;

public class Permiso implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id_permiso;
	private String nombre_permiso;
	
	public Permiso() {
		
	}
	
	public Permiso(int id_permiso, String nombre_permiso) {
		this.id_permiso = id_permiso;
		this.nombre_permiso = nombre_permiso;
	}

	public int getId_permiso() {
		return id_permiso;
	}

	public void setId_permiso(int id_permiso) {
		this.id_permiso = id_permiso;
	}

	public String getNombre_permiso() {
		return nombre_permiso;
	}

	public void setNombre_permiso(String nombre_permiso) {
		this.nombre_permiso = nombre_permiso;
	}

	@Override
	public String toString() {
		return "Permiso [id_permiso=" + id_permiso + ", nombre_permiso=" + nombre_permiso + "]";
	}

}
