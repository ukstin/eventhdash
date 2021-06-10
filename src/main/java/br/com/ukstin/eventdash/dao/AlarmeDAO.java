package br.com.ukstin.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ukstin.eventdash.model.Alarme;

public interface AlarmeDAO extends CrudRepository<Alarme, Integer>{
	public Alarme findByNome(String nome);

}
