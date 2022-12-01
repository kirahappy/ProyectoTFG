package main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Categorias")
public class Categoria {

	@Column(name="amor")
	String amor;
	
	@Column(name="amistad")
	String amistad;
	
	@Column(name="familia")
	String familia;
	
	@Column(name="trabajo")
	String trabajo;
	
	@Column(name="estudios")
	String estudios;
	
}
