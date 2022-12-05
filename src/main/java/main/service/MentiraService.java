package main.service;

import lieTime.dao.Mentira;
import lieTime.repository.MentiraRepository;

public class MentiraService {
	// TODO Las mentiras se puede crear, eliminar, editar y publicar

	MentiraRepository mentiraRepository;

	public MentiraService(MentiraRepository mentiraRepository) {
		this.mentiraRepository = mentiraRepository;
	}

	public void crearMentira(Mentira mentira) {

		mentiraRepository.save(mentira);
	}

}
