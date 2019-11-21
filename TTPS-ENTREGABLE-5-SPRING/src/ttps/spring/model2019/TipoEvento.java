package ttps.spring.model2019;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="TipoEvento")
public class TipoEvento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id_tipo_evento;
	
	@Column
	private String nombre;
	
	@Column
	private String descripcion;
	
	public TipoEvento() {
		
	}

	public TipoEvento(int id_tipo_evento, String nombre, String descripcion) {
		this.id_tipo_evento = id_tipo_evento;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getId_tipo_evento() {
		return id_tipo_evento;
	}

	public void setId_tipo_evento(int id_tipo_evento) {
		this.id_tipo_evento = id_tipo_evento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoEvento [id_tipo_evento=" + id_tipo_evento + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ "]";
	}
	
}
