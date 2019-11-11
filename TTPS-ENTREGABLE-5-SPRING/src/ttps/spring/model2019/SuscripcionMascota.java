package ttps.spring.model2019;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="SuscripcionMascota")
public class SuscripcionMascota implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column
	private int id_suscripcion_mascota;
	
	@Column
	private Date fecha;
	
	@Column
	private String estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_veterinario")
	private Veterinario veterinario;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_mascota")
	private Mascota mascota;

	public SuscripcionMascota() {
		
	}

	public SuscripcionMascota(int id_suscripcion_mascota, Date fecha, String estado, Veterinario veterinario,
			Mascota mascota) {
		this.id_suscripcion_mascota = id_suscripcion_mascota;
		this.fecha = fecha;
		this.estado = estado;
		this.veterinario = veterinario;
		this.mascota = mascota;
	}

	public int getId_suscripcion_mascota() {
		return id_suscripcion_mascota;
	}

	public void setId_suscripcion_mascota(int id_suscripcion_mascota) {
		this.id_suscripcion_mascota = id_suscripcion_mascota;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	@Override
	public String toString() {
		return "SuscripcionMascota [id_suscripcion_mascota=" + id_suscripcion_mascota + ", fecha=" + fecha + ", estado="
				+ estado + ", veterinario=" + veterinario + ", mascota=" + mascota + "]";
	}
	
}
