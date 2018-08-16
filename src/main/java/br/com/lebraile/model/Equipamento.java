package br.com.lebraile.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Equipamento {

	private Long id;
	
	private String ip;
	
	private String nomeAluno;
	
	private Long tempoCaractere;
	
}
