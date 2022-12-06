package main.service;

import lieTime.dao.UsuarioDao;
import lieTime.repository.UsuarioRepository;

public class UsuarioService {
	
	UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public void getUsuarioByUser(UsuarioDao user) {
		usuarioRepository.findUsuarioByUser(user.getUser());
	}
}
