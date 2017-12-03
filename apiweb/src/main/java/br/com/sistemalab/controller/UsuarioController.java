package br.com.sistemalab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistemalab.model.Usuario;
import br.com.sistemalab.service.UserService;

@Controller
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	

	@Autowired
	private UserService usuarioService;

	@RequestMapping(method = RequestMethod.POST, value = "/")
	public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario) {
		Usuario usuarioCadastrado = usuarioService.cadastrar(usuario);

		if (usuarioCadastrado == null) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<>(usuarioCadastrado, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public ResponseEntity logar(@RequestBody Usuario usuario) {
		Usuario usuarioLogado = usuarioService.logar(usuario);
		if (usuarioLogado == null) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}

		return new ResponseEntity<>(usuarioLogado, HttpStatus.OK);
	}
}