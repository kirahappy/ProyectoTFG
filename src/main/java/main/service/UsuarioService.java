package main.service;

import lieTime.model.UsuarioModel;
import lieTime.repository.UsuarioRepository;

public class UsuarioService {
	
	UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public void getUsuarioByUser(UsuarioModel user) {
		usuarioRepository.findUsuarioByUser(user.getUser());
	}
}
