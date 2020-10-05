package br.com.lojauati.teste;

import br.com.lojauati.modelo.Formula1;

public class TesteFormula2 {

	public static void main(String[] args) {
		Formula1 objeto = new Formula1 ();
		objeto.preencherTudo("mclaren", (float) 150000.50 , 1000);
		System.out.println(objeto.exibirTudo());
		System.out.println(objeto.exibirPromocao());
		System.out.println(objeto.exibirPromocao(50));
	}

}
