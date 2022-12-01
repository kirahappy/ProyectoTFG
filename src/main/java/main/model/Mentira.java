package main.model;

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
@Table(name = "mentiras")
public class Mentira {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "texto")
	private String textoMentira;

	@Column(name = "complices")
	private String complices; // Son los que saben la mentira aparte del usuario

	@Column(name = "id")
	private String inocentes; // Son los que NO saben la mentira

	@ManyToMany(mappedBy = "mentiras", fetch = FetchType.EAGER)
	private Set<Usuario> usuarios;

	public Mentira() {
		usuarios = new HashSet<Usuario>(); 
	}

	public Mentira(String nombre, String textoMentira, String complices, String inocentes) {
		this.nombre = nombre;
		this.textoMentira = textoMentira;
		this.complices = complices;
		this.inocentes = inocentes;
		usuarios = new HashSet<Usuario>();
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

	public String getTextoMentira() {
		return textoMentira;
	}

	public void setTextoMentira(String textoMentira) {
		this.textoMentira = textoMentira;
	}

	public String getComplices() {
		return complices;
	}

	public void setComplices(String complices) {
		this.complices = complices;
	}

	public String getInocentes() {
		return inocentes;
	}

	public void setInocentes(String inocentes) {
		this.inocentes = inocentes;
	}

	public String toString() {
		return "Mentira [id=" + id + ", nombre=" + nombre + ", textoMentira=" + textoMentira + ", complices="
				+ complices + ", inocentes=" + inocentes + "]";
	}

}
