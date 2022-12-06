package lieTime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lieTime.dao.MentiraDao;
import lieTime.dao.UsuarioDao;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioDao, Integer> {
	
	
//	public UsuarioDao findUsuarioByUserAndAdministrastor(String user, boolean administrator);
	
	public UsuarioDao findUsuarioByUser(String user);
}
