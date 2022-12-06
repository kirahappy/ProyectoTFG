package main.service;

import lieTime.repository.UsuarioRepository;

public class UsuarioService {
	
	UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public void getUsuarioByUser() {
		usuarioRepository.findUsuarioByUser(user);
	}
}
