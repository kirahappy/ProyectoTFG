package lieTime.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lieTime.dao.ComentarioDao;

public interface ComentarioRepository extends JpaRepository<ComentarioDao, Integer> {
//	public ComentarioDao insertarComentario (ComentarioDao comentario);
//	public List<ComentarioDao> mostrarComentarios();
//	public void eliminarComentarioId(Integer id);

}
