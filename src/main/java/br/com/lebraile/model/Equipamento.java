package br.com.lebraile.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Equipamento {

	private Long id;
	
	private String ip;
	
	private String nomeAluno;
	
	private Long tempoCaractere;
	
}
