
package lieTime.dao;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lieTime.model.Categoria;

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

	@Column(name = "categoria", nullable = true)
	@Enumerated(value = EnumType.STRING)
	private Categoria categoria;

	public MentiraDao() {
		comentarios = new HashSet<ComentarioDao>();
	}

	public MentiraDao(UsuarioDao usu) {
		usuario = usu;
		comentarios = new HashSet<ComentarioDao>();
	}

	public MentiraDao(String nombre, String textoMentira, String complices, String inocentes, Categoria categoria) {
		this.nombre = nombre;
		this.textoMentira = textoMentira;
		this.complices = complices;
		this.inocentes = inocentes;
		this.categoria = categoria;
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

	public Set<ComentarioDao> getComentarios() {
		return comentarios;
	}

	public void setComentarios(Set<ComentarioDao> comentarios) {
		this.comentarios = comentarios;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}