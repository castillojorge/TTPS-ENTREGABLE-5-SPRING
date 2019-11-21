package ttps.spring.model2019;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Recordatorio")
public class Recordatorio implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column
	private int id_recordatorio;
	
	@Column
	private Date fecha;
	
	@Column
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="id_mascota")
	private Mascota aMascota;
	
	public Recordatorio() {
	
	}

	public Recordatorio(int id_recordatorio, Date fecha, String descripcion, Mascota aMascota) {

		this.id_recordatorio = id_recordatorio;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.aMascota = aMascota;
	}

	public int getId_recordatorio() {
		return id_recordatorio;
	}

	public void setId_recordatorio(int id_recordatorio) {
		this.id_recordatorio = id_recordatorio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Mascota getaMascota() {
		return aMascota;
	}

	public void setaMascota(Mascota aMascota) {
		this.aMascota = aMascota;
	}

	@Override
	public String toString() {
		return "Recordatorio [id_recordatorio=" + id_recordatorio + ", fecha=" + fecha + ", descripcion=" + descripcion
				+ ", aMascota=" + aMascota + "]";
	}

	
}

