package ttps.spring.model2019;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Dueño")
public class Dueño implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="id_dueño")
	private int id_dueño;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="telefono")
	private int telefono;
	
	@Column(name="email")
	private String email;
	
	@OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_ficha_publica")
	private FichaPublica fpublica;
	
	@OneToMany(mappedBy = "miDueño" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Mascota> mascotas = new ArrayList<Mascota>();
	
	public Dueño() {
		
	}

	public Dueño(int id_dueño, String nombre, String apellido, int telefono, String email,List<Mascota> mascotas, FichaPublica fpublica) {
		this.id_dueño = id_dueño;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.mascotas = mascotas;
		this.fpublica = fpublica;
	}
	
	
	public int getId_dueño() {
		return id_dueño;
	}

	public void setId_dueño(int id_dueño) {
		this.id_dueño = id_dueño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public List<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	
	public FichaPublica getFpublica() {
		return fpublica;
	}

	public void setFpublica(FichaPublica fpublica) {
		this.fpublica = fpublica;
	}

	@Override
	public String toString() {
		return "Dueño [id_dueño=" + id_dueño + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", email=" + email + ", fpublica=" + fpublica + ", mascotas=" + mascotas + "]";
	}		
	
}
