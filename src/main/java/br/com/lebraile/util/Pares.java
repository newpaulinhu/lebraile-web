package br.com.lebraile.util;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Getter 
@Setter 
@AllArgsConstructor // <--- THIS is it
public class Pares implements Serializable {
	
	private Character caractere;
	
	private String braile;
	
	private boolean numero;
	
	
	
}