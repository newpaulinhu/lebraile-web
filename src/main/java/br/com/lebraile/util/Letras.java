package br.com.lebraile.util;


public enum Letras {
	
	SPACE(" ", "000000"),
	A("A" , "100000"),
	A_ACENTUADA("Ã" , "010110"),
	B("B" , "101000"),
	C("C" , "110000"),
	CEDILHA("Ç" , "111011"),
	D("D" , "110100"),
	E("E" , "100100"),
	F("F" , "111000"),
	G("G" , "111100"),
	H("H" , "101100"),
	I("I" , "011000"),
	J("J" , "011100"),
	K("K" , "100010"),
	L("L" , "101010"),
	M("M" , "110010"),
	N("N" , "110110"),
	N_ACENTUADA("Ñ" , "111101"),
	O("O" , "100110"),
	P("P" , "111010"),
	Q("Q" , "111110"),
	R("R" , "101110"),
	S("S" , "011010"),
	T("T" , "011110"),
	U("U" , "100011"),
	V("V" , "101011"),
	X("X" , "110011"),
	W("W" , "011101"),
	Y("Y" , "110111"),
	Z("Z" , "100111"),
	PONTO(".", "000010"),
	DOIS_PONTOS(":","001100"),
	
	
	//TODO Tratar caracteres especiais
	ZERO("0", "101110111"),
	UM("1", "111010100"),
	DOIS("2", "111110100"),
	TRES("3", "111010110"),
	QUATRO("4", "111010111"),
	CINCO("5", "111010101"),
	SEIS("6", "111110110"),
	SETE("7", "111110111"),
	OITO("8", "111110101"),
	NOVE("9", "101110110"),
	VIRGULA(",","111111010"),
	PONTO_VIRGULA(";","000000011");
	
	
	String letra;
	String codigo;

	private Letras(String letra, String codigo) {
		this.letra = letra;
		this.codigo = codigo;
	}
	
	public String getLetra() {
		return letra;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public static String buscarCodigo(String caracter) {
		
		for (Letras letra : Letras.values()) {
			if (letra.getLetra().equals(caracter.toUpperCase())) {
				return letra.getCodigo();
			}
		}
		
		return null;
	}
}
