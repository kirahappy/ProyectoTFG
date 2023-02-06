package lieTime.service;

import lieTime.dao.MentiraDao;
import lieTime.repository.MentiraRepository;

public class MentiraService {

	// Service utiliza los dao porque en los dao están las relaciones entre las
	// tablas y la info necesaria para la db

	// TODO Las mentiras se puede crear, eliminar, editar y publicar

	MentiraRepository mentiraRepository;

	public MentiraService(MentiraRepository mentiraRepository) {
		this.mentiraRepository = mentiraRepository;
	}

	public void crearMentira(MentiraDao mentira) {

		mentiraRepository.save(mentira);
	}

}
