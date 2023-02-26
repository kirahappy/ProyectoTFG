package lieTime.service;

import java.util.Optional;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lieTime.dao.UsuarioDao;
import lieTime.model.UsuarioModel;
import lieTime.repository.UsuarioRepository;

public class UsuarioService {
	
	UsuarioRepository usuarioRepository;
	
	public BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public void getUsuarioByUser(UsuarioModel user) {
		usuarioRepository.findByUsername(user.getUser());
	}
	

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<UsuarioDao> usuario = usuarioRepository.findByUsername(username);
		if (usuario.isPresent()) {
			UsuarioDao springUserMio = usuario.get();
			return springUserMio;
		} else {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}
	}
}
