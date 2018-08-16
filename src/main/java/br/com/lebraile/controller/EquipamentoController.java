package br.com.lebraile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lebraile.component.EquipamentoComponent;
import br.com.lebraile.model.Equipamento;

@RestController
public class EquipamentoController {

	@Autowired
	private EquipamentoComponent component;
	
	@GetMapping("/equipamento")
	public List<Equipamento> listar() {
		return component.getEquipamentos();
	}
	
	@PostMapping("/equipamento")
	public void adicionarEquipamento(Equipamento equipamento) {
		component.adicionarEquipamento(equipamento);
	}
	
	@PostMapping("/equipamento/{id}")
	public void removerEquipamento(Long id) {
		component.removerEquipamento(id);
	}
}
