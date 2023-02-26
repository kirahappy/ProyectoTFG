package lieTime.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
	private Set<UsuarioDao> usuarios;

	public Rol() {
		usuarios = new HashSet<UsuarioDao>();
	}

	public Rol(String nombre) {
		this.nombre = nombre;
		usuarios = new HashSet<UsuarioDao>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<UsuarioDao> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<UsuarioDao> usuarios) {
		this.usuarios = usuarios;
	}

}
