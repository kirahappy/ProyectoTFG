package lieTime.service;

import java.util.ArrayList;
import java.util.List;

import lieTime.dao.MentiraDao;
import lieTime.model.Categoria;
import lieTime.model.MentiraModel;
import lieTime.repository.MentiraRepository;

public class MentiraService {

	// Service utiliza los dao porque en los dao están las relaciones entre las
	// tablas y la info necesaria para la db

	// TODO Las mentiras se puede crear, eliminar, editar y publicar

	MentiraRepository mentiraRepository;

	/* ------------ CONSTRUCTOR ------------ */
	public MentiraService(MentiraRepository mentiraRepository) {
		this.mentiraRepository = mentiraRepository;
	}

	/* ------------ MÉTODOS ------------ */
	public void crearMentira(MentiraDao mentira) {
		mentiraRepository.save(mentira);
	}

	public MentiraDao editarNuevaLie(MentiraModel mentira) {
		MentiraDao nuevaMentira = new MentiraDao(mentira.getNombre(), mentira.getTextoMentira(),
				mentira.getComplices(), mentira.getInocentes(), mentira.getCategoria());
		
		return mentiraRepository.save(nuevaMentira);
	}

	public List<MentiraDao> listarMentiras() {
		return mentiraRepository.findAll();
	}
	
	public List<MentiraDao> listarMentiraCategoria(Categoria categoria) {
		List<MentiraDao> mentiras = new ArrayList<MentiraDao>();
		while (mentiraRepository.findMentiraByCategoria(categoria) == true) {
			mentiras = mentiraRepository.findAll();	
		}
		return mentiras;
	}

	public MentiraDao obternerMentiraId(Integer id) {
		return mentiraRepository.findById(id).get();
	}
	
	public MentiraDao obternerMentiraCategoria(Categoria categoria) {
		return mentiraRepository.findMentiraByCategoria2(categoria).get();
	}
	
	public void deleteMentiraId(Integer id) {
		mentiraRepository.deleteById(id);
	}
	
}
