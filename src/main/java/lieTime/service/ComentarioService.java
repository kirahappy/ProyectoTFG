package lieTime.service;

import java.util.List;

import lieTime.dao.ComentarioDao;
import lieTime.repository.ComentarioRepository;

public class ComentarioService {

	ComentarioRepository comentarioRepository;

	/* ------------ CONSTRUCTOR ------------ */
	public ComentarioService(ComentarioRepository comentarioRepository) {
		this.comentarioRepository = comentarioRepository;
	}

	/* ------------ MÉTODOS ------------ */
	public void crearComentario(ComentarioDao comentario) {
		comentarioRepository.save(comentario);
	}

	public void eleminarComentario(ComentarioDao comentario) {
		comentarioRepository.delete(comentario);
	}
	
	public List<ComentarioDao> listarComentarios() {
		return comentarioRepository.findAll();
	}
}
