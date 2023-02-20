package lieTime.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lieTime.dao.MentiraDao;
import lieTime.model.Categoria;

@Repository
public interface MentiraRepository extends JpaRepository<MentiraDao, Integer> {
	public boolean findMentiraByCategoria(Categoria categoria);
	public Optional<MentiraDao> findMentiraByCategoria2(Categoria categoria);
}
