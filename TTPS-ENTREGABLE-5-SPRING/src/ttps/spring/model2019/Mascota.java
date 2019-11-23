package ttps.spring.model2019;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Mascota")
public class Mascota implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="id_mascota")
	private int id_mascota;
	
	@Column
	private String nombre;
	
	@Column
	private Date fechaNacimiento;
	
	@Column
	private String especie;
	
	@Column
	private String raza;
	
	@Column
	private String sexo;
	
	@Column
	private String color;
	
	@Column
	private String señasParticulares;
	
	@Column
	private String foto; //Ver Como Manejar en Java y La Bd Fotos
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_dueño")
	@JsonIgnore
	private Dueño miDueño;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="id_veterinario")
	private Veterinario miVeterinario;
	
	@OneToMany(mappedBy = "aMascota" , cascade = {CascadeType.ALL})
	@JsonIgnore
	private List<Recordatorio> misRecordatorios;
	
	@OneToMany(mappedBy = "aMascota", cascade = {CascadeType.ALL})
	@JsonIgnore
	private List<Evento> misEventos;
	
	public Mascota() {
		
	}

	public Mascota(int id_mascota, String nombre, Date fechaNacimiento, String especie, String raza, String sexo,
			String color, String señasParticulares, String foto, Dueño miDueño, List<Recordatorio> misRecordatorios,
			List<Evento> misEventos) {
		this.id_mascota = id_mascota;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.raza = raza;
		this.sexo = sexo;
		this.color = color;
		this.señasParticulares = señasParticulares;
		this.foto = foto;
		this.miDueño = miDueño;
		this.misRecordatorios = misRecordatorios;
		this.misEventos = misEventos;
	}

	public int getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(int id_mascota) {
		this.id_mascota = id_mascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSeñasParticulares() {
		return señasParticulares;
	}

	public void setSeñasParticulares(String señasParticulares) {
		this.señasParticulares = señasParticulares;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Dueño getMiDueño() {
		return miDueño;
	}

	public void setMiDueño(Dueño miDueño) {
		this.miDueño = miDueño;
	}

	public List<Recordatorio> getMisRecordatorios() {
		return misRecordatorios;
	}

	public void setMisRecordatorios(List<Recordatorio> misRecordatorios) {
		this.misRecordatorios = misRecordatorios;
	}

	public List<Evento> getMisEventos() {
		return misEventos;
	}

	public void setMisEventos(List<Evento> misEventos) {
		this.misEventos = misEventos;
	}

	@Override
	public String toString() {
		return "Mascota [id_mascota=" + id_mascota + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", especie=" + especie + ", raza=" + raza + ", sexo=" + sexo + ", color=" + color
				+ ", señasParticulares=" + señasParticulares + ", foto=" + foto + ", miDueño=" + miDueño
				+ ", misRecordatorios=" + misRecordatorios + ", misEventos=" + misEventos + "]";
	}
		
}
