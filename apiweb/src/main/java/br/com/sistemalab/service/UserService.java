package br.com.sistemalab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistemalab.model.Usuario;
import br.com.sistemalab.repository.UsuarioRepositorio;

@Service
public class UserService {

		
		@Autowired
		private UsuarioRepositorio usuarioRepository;
		
		public Usuario cadastrar(Usuario usuario) {
			
			List<Usuario> allUsers = usuarioRepository.findAll();
			
			for (Usuario usuario2 : allUsers) {
				if (usuario2.getEmail().equals(usuario.getEmail())) {
					return null;
				}
			}
			return usuarioRepository.save(usuario);
		}
		
		public Usuario logar(Usuario usuario) {
			
			List<Usuario> allUsers = usuarioRepository.findAll();
			
			for (Usuario usuario2 : allUsers) {
				if (usuario2.getEmail().equalsIgnoreCase(usuario.getEmail())) {
					if (usuario2.getPassword().equals(usuario.getPassword())) {
						return usuario2;
					}
				} 
			}
			return null;
		}
	}