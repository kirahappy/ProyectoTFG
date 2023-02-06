package lieTime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lieTime.dao.MentiraDao;

@Repository
public interface MentiraRepository extends JpaRepository<MentiraDao, Integer> {
	

}
