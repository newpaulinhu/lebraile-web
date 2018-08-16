package br.com.lebraile.util;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Classe responsável por desenhar para exemplificar a letra em braile sendo as
 * prestas as que devem estar selecionads e as verdes abaixadsas
 * 
 * @author Paulo
 *
 */
public class TradutoraBraile {
	
	public static final Pattern DIACRITICS_AND_FRIENDS = Pattern.compile("[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+");
	
	public Pares traduzirCaracter(Character c) {
		Pares letra = new Pares(c, traduzirLetra(c), c != null ? Character.isDigit(c) : false);
		return letra;
	}

	public List<Pares> traduzirTexto(String texto) {
		List<Pares> caracteres = new ArrayList<>();
		char[] caracteresTexto = texto.toCharArray();
		for (char c : caracteresTexto) {
			caracteres.add(new Pares(c, traduzirLetra(c), Character.isDigit(c)));
		}
		return caracteres;
	}

	private String traduzirLetra(Character ch) {
		if (ch == null) {
			ch = ' ';
		}
		String codigoLetra = Letras.buscarCodigo(removeAcento(ch));
		return codigoLetra;
	}

	private static String removeAcento(char c) {
		String str = Normalizer.normalize(String.valueOf(c), Normalizer.Form.NFD);
		str = DIACRITICS_AND_FRIENDS.matcher(str).replaceAll("");
		return str;
	}
}
