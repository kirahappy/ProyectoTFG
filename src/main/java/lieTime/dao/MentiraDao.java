
package lieTime.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

// TODO CAMIBAIR PAQURETE A DAO EL MODEL NO EXISTE

@Entity
@Table(name = "mentiras")
public class MentiraDao {
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

	@Column(name = "inocentes")
	private String inocentes; // Son los que NO saben la mentira

	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = true)
	private UsuarioDao usuario;

	@OneToMany(cascade = { CascadeType.MERGE }, mappedBy = "mentira", fetch = FetchType.EAGER)
	private Set<ComentarioDao> comentarios;

	@ManyToOne
	@JoinColumn(name = "categoria", nullable = true)
	@JsonIgnore
	private CategoriaDao categoria;

	public MentiraDao() {
		comentarios = new HashSet<ComentarioDao>();
	}

	public MentiraDao(UsuarioDao usu) {
		usuario = usu;
		comentarios = new HashSet<ComentarioDao>();
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

	public UsuarioDao getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDao usuario) {
		this.usuario = usuario;
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
}
