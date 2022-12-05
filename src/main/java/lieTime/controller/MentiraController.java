package lieTime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import main.dao.Mentira;
import main.dao.Usuario;
import main.service.MentiraService;

public class Controller {
	
	MentiraService mentiraService;
	UsuarioService usuarioService;
	
	
	
	
	

	@Autowired
	public MentiraController(MentiraService mentiraService, ) {
		this.mentiraService = mentiraService;
	}

	@GetMapping(value = "mentiras/crear")
	public void crearMentira(@PathVariable String usuario, @RequestBody Mentira mentira) {
		
		
		//Getter pàra obtener un usuario ya registrado
		Usuario usario = usuarioService.getusuarioByUser(usario);
		
				
		mentira.set(usuario);
		
		mentiraService.crearMentira(mentira);
	}
}
