package lieTime.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import lieTime.dao.MentiraDao;
import lieTime.model.MentiraModel;
import lieTime.model.UsuarioModel;
import lieTime.service.MentiraService;
import lieTime.service.UsuarioService;

public class Controller {
	
	// El controller utiliza los model para la lógica de negocio
	
//	MentiraService mentiraService;
//	UsuarioService usuarioService;
//	
//	@Autowired
//	public Controller(MentiraService mentiraService, UsuarioService usuarioService) {
//		this.mentiraService = mentiraService;
//		this.usuarioService = usuarioService;
//	}
//	
//	
//
//	@GetMapping(value = "mentiras/crear")
//	public void crearMentira(@PathVariable UsuarioModel usuario, @RequestBody MentiraDao mentira) {
//		
//		
//		//Getter pàra obtener un usuario ya registrado
//		UsuarioModel usuarioModel = usuarioService.getUsuarioByUser(usuario);			
////		mentira.getUsuario();
//		mentiraService.crearMentira(mentira);
//	}
//	
//	@GetMapping(value= "mentiras/edit")
//	public void editarMentira() {
//		
//	}
}
