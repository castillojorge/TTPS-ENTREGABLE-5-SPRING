package ttps.spring.model2019;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Atencion")
public class Atencion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id_atencion;
	
	@Column
	private Date fecha;
	
	@Column
	private int peso;
	
	@Column
	private String indicaciones;
	
	@Column
	private String diagnostico;
	
	@Column
	private String motivo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_veterinario")
	private Veterinario aVeterinario;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "id_mascota")
	private Mascota mascota;
	
	@OneToMany(mappedBy = "id_evento", cascade = {CascadeType.ALL})
	private List<Evento> eventos;
	
	public Atencion() {
		
	}

	public Atencion(int id_atencion, Date fecha, int peso, String indicaciones, String diagnostico, String motivo,
			Veterinario aVeterinario, Mascota mascota, List<Evento> eventos) {
		this.id_atencion = id_atencion;
		this.fecha = fecha;
		this.peso = peso;
		this.indicaciones = indicaciones;
		this.diagnostico = diagnostico;
		this.motivo = motivo;
		this.aVeterinario = aVeterinario;
		this.mascota = mascota;
		this.eventos = eventos;
	}

	public int getId_atencion() {
		return id_atencion;
	}

	public void setId_atencion(int id_atencion) {
		this.id_atencion = id_atencion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getIndicaciones() {
		return indicaciones;
	}

	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Veterinario getaVeterinario() {
		return aVeterinario;
	}

	public void setaVeterinario(Veterinario aVeterinario) {
		this.aVeterinario = aVeterinario;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	@Override
	public String toString() {
		return "Atencion [id_atencion=" + id_atencion + ", fecha=" + fecha + ", peso=" + peso + ", indicaciones="
				+ indicaciones + ", diagnostico=" + diagnostico + ", motivo=" + motivo + ", aVeterinario="
				+ aVeterinario + ", mascota=" + mascota + ", eventos=" + eventos + "]";
	}	

}
