package main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Categorias")
public class Categoria {
	private enum Categorias {
		AMOR, AMISTAD, FAMILIA, TRABAJO, ESTUDIOS

	};

	@Column(name = "categoria")
	Categorias categoria;

	public Categoria(Categorias categoria) {
		this.categoria = categoria;
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
