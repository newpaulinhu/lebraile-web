package br.com.lebraile.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Equipamento {

	private Long id;
	
	private String ip;
	
	private String nomeAluno;
	
	private Long tempoCaractere;
	
}
