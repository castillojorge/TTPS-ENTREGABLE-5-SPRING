package ttps.spring.model2019;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Veterinario")
public class Veterinario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column
	private int id_veterinario;
	
	@Column
	private String nombreConsultorio;
	
	@Column
	private String direccionConsultorio;
	
	@Column
	private String estado;
	
	@OneToMany(mappedBy = "miVeterinario", cascade = {CascadeType.ALL})
	private List<Mascota> misPacientes;
	
	@OneToMany(mappedBy = "aVeterinario", cascade = {CascadeType.ALL})
	private List<Atencion> misAtenciones;
	
	@OneToMany(mappedBy = "veterinario", cascade = {CascadeType.ALL})
	private List<SuscripcionMascota> misSuscripciones;
	
	public Veterinario() {
		
	}

	public Veterinario(int id_veterinario, String nombreConsultorio, String direccionConsultorio, String estado,
			List<Mascota> misPacientes, List<Atencion> misAtenciones, List<SuscripcionMascota> misSuscripciones) {
		this.id_veterinario = id_veterinario;
		this.nombreConsultorio = nombreConsultorio;
		this.direccionConsultorio = direccionConsultorio;
		this.estado = estado;
		this.misPacientes = misPacientes;
		this.misAtenciones = misAtenciones;
		this.misSuscripciones = misSuscripciones;
	}



	public int getId_veterinario() {
		return id_veterinario;
	}

	public void setId_veterinario(int id_veterinario) {
		this.id_veterinario = id_veterinario;
	}

	public String getNombreConsultorio() {
		return nombreConsultorio;
	}

	public void setNombreConsultorio(String nombreConsultorio) {
		this.nombreConsultorio = nombreConsultorio;
	}

	public String getDireccionConsultorio() {
		return direccionConsultorio;
	}

	public void setDireccionConsultorio(String direccionConsultorio) {
		this.direccionConsultorio = direccionConsultorio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Mascota> getMisPacientes() {
		return misPacientes;
	}

	public void setMisPacientes(List<Mascota> misPacientes) {
		this.misPacientes = misPacientes;
	}

	public List<Atencion> getMisAtenciones() {
		return misAtenciones;
	}

	public void setMisAtenciones(List<Atencion> misAtenciones) {
		this.misAtenciones = misAtenciones;
	}

	public List<SuscripcionMascota> getMisSuscripciones() {
		return misSuscripciones;
	}

	public void setMisSuscripciones(List<SuscripcionMascota> misSuscripciones) {
		this.misSuscripciones = misSuscripciones;
	}

	@Override
	public String toString() {
		return "Veterinario [id_veterinario=" + id_veterinario + ", nombreConsultorio=" + nombreConsultorio
				+ ", direccionConsultorio=" + direccionConsultorio + ", estado=" + estado + ", misPacientes="
				+ misPacientes + ", misAtenciones=" + misAtenciones + ", misSuscripciones=" + misSuscripciones + "]";
	}

}
