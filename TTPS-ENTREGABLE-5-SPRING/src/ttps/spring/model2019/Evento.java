package ttps.spring.model2019;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Evento")
public class Evento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column
	private int id_evento;
	
	@Column
	private Date fecha;
	
	@Column
	private String descripcion;
	
	@Column
	private int nroCachorros;
	
	@Column
	private String droga;
	
	@Column
	private String resultado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_mascota")
	private Mascota aMascota;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name ="id_tEvento")
	private TipoEvento tEvento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_atencion")
	private Atencion aAtencion;
	
	public Evento() {
		
	}

	public Evento(int id_evento, Date fecha, String descripcion, int nroCachorros, String droga, String resultado,
			Mascota aMascota, TipoEvento tEvento, Atencion aAtencion) {
		this.id_evento = id_evento;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.nroCachorros = nroCachorros;
		this.droga = droga;
		this.resultado = resultado;
		this.aMascota = aMascota;
		this.tEvento = tEvento;
		this.aAtencion = aAtencion;
	}



	public int getId_evento() {
		return id_evento;
	}

	public void setId_evento(int id_evento) {
		this.id_evento = id_evento;
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

	public int getNroCachorros() {
		return nroCachorros;
	}

	public void setNroCachorros(int nroCachorros) {
		this.nroCachorros = nroCachorros;
	}

	public String getDroga() {
		return droga;
	}

	public void setDroga(String droga) {
		this.droga = droga;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Mascota getaMascota() {
		return aMascota;
	}

	public void setaMascota(Mascota aMascota) {
		this.aMascota = aMascota;
	}

	public TipoEvento gettEvento() {
		return tEvento;
	}

	public void settEvento(TipoEvento tEvento) {
		this.tEvento = tEvento;
	}
	
	public Atencion getaAtencion() {
		return aAtencion;
	}

	public void setaAtencion(Atencion aAtencion) {
		this.aAtencion = aAtencion;
	}

	@Override
	public String toString() {
		return "Evento [id_evento=" + id_evento + ", fecha=" + fecha + ", descripcion=" + descripcion
				+ ", nroCachorros=" + nroCachorros + ", droga=" + droga + ", resultado=" + resultado + ", aMascota="
				+ aMascota + ", tEvento=" + tEvento + ", aAtencion=" + aAtencion + "]";
	}

}
