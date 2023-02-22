package lieTime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lieTime.dao.ComentarioDao;

public interface ComentarioRepository extends JpaRepository<ComentarioDao, Integer> {

}