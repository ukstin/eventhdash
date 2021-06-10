package br.com.ukstin.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ukstin.eventdash.dao.EquipamentosDAO;
import br.com.ukstin.eventdash.model.Equipamento;

@RestController
@CrossOrigin("*")
public class EquipamentoController {

	@Autowired
	private EquipamentosDAO dao;
	
	@GetMapping("/equipamentos")
	public ArrayList<Equipamento> recuperarTodos() {
		
		ArrayList<Equipamento> lista;
		
		lista= (ArrayList<Equipamento>)dao.findAll();
		
		return lista;
	}
	

}
