package lieTime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lieTime.dao.Mentira;
import lieTime.dao.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
	
	
	public Usuario findUsuarioByUserAndAdministrastor(String user, boolean administrator);
}
