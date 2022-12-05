package lieTime.model;

public class CategoriaModel {
	private enum Categorias {
		AMOR, AMISTAD, FAMILIA, TRABAJO, ESTUDIOS

	};

	Categorias categoria;

	public CategoriaModel(Categorias categoria) {
		this.categoria = categoria;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public String toString() {
		return "Categoria: " + categoria + "   ===>";
	}

}
