package br.com.lebraile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public void adicionarEquipamento(@RequestBody Equipamento equipamento) {
		component.adicionarEquipamento(equipamento);
	}
	
	@DeleteMapping("/equipamento/{id}")
	public void removerEquipamento(@PathVariable Long id) {
		component.removerEquipamento(id);
	}
}
