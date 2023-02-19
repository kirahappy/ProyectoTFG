package lieTime.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lieTime.dao.MentiraDao;

@Repository
public interface MentiraRepository extends JpaRepository<MentiraDao, Integer> {
//	public MentiraDao insertarMentira(MentiraDao mentira);
//
//	public List<MentiraDao> listarMentiras();
//
//	public MentiraDao obternerMentiraId(Integer id);
//
//	public void deleteMentiraId(Integer id);

}
