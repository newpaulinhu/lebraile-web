package br.com.lebraile.component;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.lebraile.model.Equipamento;

@Component
public class EquipamentoComponent {

	private static List<Equipamento> equipamentos = new LinkedList<>();
	
	public void adicionarEquipamento(Equipamento equipamento) {
		equipamento.setId(Long.valueOf(equipamentos.size()));
		equipamentos.add(equipamento);
	}
	
	public void removerEquipamento(Long id) {
		Equipamento equipamento = equipamentos.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
		if (equipamento != null) {
			equipamentos.remove(equipamento);
		}
	}
	
	public List<Equipamento> getEquipamentos(){
		return equipamentos;
	}
}
