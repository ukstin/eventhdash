// DAO - data access object
package br.com.ukstin.eventdash.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.ukstin.eventdash.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	// aqui eu faço consultas customizadas
	public Usuario findByEmailOrRacf(String email, String racf);
}
