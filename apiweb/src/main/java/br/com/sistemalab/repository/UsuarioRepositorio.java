package br.com.sistemalab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.sistemalab.model.*;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {	

}
