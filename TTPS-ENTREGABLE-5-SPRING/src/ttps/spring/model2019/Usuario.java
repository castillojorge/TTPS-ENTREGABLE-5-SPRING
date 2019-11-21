package ttps.spring.model2019;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int id_user;
	@Column(name = "nombre_user")
	private String nombre_user;
	@Column(name = "apellido_user")
	private String apellido_user;
	@Column(name = "telefono_user") //Ver Como Convierte este campo tiene que poder ser Null
	private String telefono;
	@Column(name="email_user")
	private String email_user;
	@Column(name="password")
	private String password;
	@Column(name="rol")
	private String rol;
	
	//@Column(name="fecha_creacion")
	//private Date fecha_creacion;
	
	public Usuario() {
		
	}

	public Usuario(int id_user, String nombre_user, String apellido_user, String telefono,
			String email_user, String password, String rol) {
		this.id_user = id_user;
		this.nombre_user = nombre_user;
		this.apellido_user = apellido_user;
		this.telefono = telefono;
		this.email_user = email_user;
		this.password = password;
		//this.fecha_creacion = fecha_creacion;
	    this.rol = rol;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getNombre_user() {
		return nombre_user;
	}

	public void setNombre_user(String nombre_user) {
		this.nombre_user = nombre_user;
	}

	public String getApellido_user() {
		return apellido_user;
	}

	public void setApellido_user(String apellido_user) {
		this.apellido_user = apellido_user;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail_user() {
		return email_user;
	}

	public void setEmail_user(String email_user) {
		this.email_user = email_user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Usuario [id_user=" + id_user + ", nombre_user=" + nombre_user + ", apellido_user=" + apellido_user
				+ ", telefono=" + telefono + ", email_user=" + email_user + ", password=" + password + ", rol=" + rol
				+ "]";
	}

}
