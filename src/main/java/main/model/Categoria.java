package main.model;

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
public class Categoria {
	private enum Categorias {
		AMOR, AMISTAD, FAMILIA, TRABAJO, ESTUDIOS

	};

	@Column(name = "categoria")
	Categorias categoria;

	@OneToMany(cascade = { CascadeType.MERGE },mappedBy="categoria",fetch=FetchType.EAGER)
	private Set<Mentira> mentiras;

	public Categoria() {
		mentiras = new HashSet<Mentira>();
	}

	public Categoria(Categorias categoria) {
		this.categoria = categoria;
		mentiras = new HashSet<Mentira>();
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public String toString() {
		return "Categoria [categoria=" + categoria + "]";
	}

}
