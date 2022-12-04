package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Mentira;
import main.model.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
	
	
	public Usuario findUsuarioByUserAndAdministrastor(String user, boolean administrator);
}
