package lieTime.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class CategoriaDao {
	private enum Categorias {
		AMOR, AMISTAD, FAMILIA, TRABAJO, ESTUDIOS

	};

	@Column(name = "categoria")
	Categorias categoria;

	@OneToMany(cascade = { CascadeType.MERGE }, mappedBy = "categoria", fetch = FetchType.EAGER)
	private Set<MentiraDao> mentiras;

	public CategoriaDao() {
		mentiras = new HashSet<MentiraDao>();
	}

	public CategoriaDao(Categorias categoria) {
		this.categoria = categoria;
		mentiras = new HashSet<MentiraDao>();
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

}
