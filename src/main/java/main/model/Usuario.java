package main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "usuario")
	private String user;

	@Column(name = "contraseña")
	private String password;

	@Column(name = "administrador")
	private boolean administrator;

	public Usuario(String user, String password, boolean administrator) {
		this.user = user;
		this.password = password;
		this.administrator = administrator;
	}

	public Usuario(String user, String password) {
		this.user = user;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdministrator() {
		return administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}

	public String toString() {
		return "Usuario [id=" + id + ", user=" + user + ", password=" + password + ", administrator=" + administrator
				+ "]";
	}

}
