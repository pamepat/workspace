package br.com.lojauati.modelo;

public class Elevador {

	private int qtdePessoas;
	private int capacidadePessoas;
	private int andarAtual;
	private int maiorAndar;
	private int menorAndar;
	
	public Elevador () {}
	
	public Elevador (int cp, int ma) {
		capacidadePessoas=cp;
		maiorAndar=ma;
	}
	
	public String exibirTudo() {
		return 
				"Capcidade m�xima: " + capacidadePessoas + "\n" +
				"Qtde de Pessoas Atual: " + qtdePessoas + "\n" +
				"Andar Atual: " + andarAtual + "\n" +
				"Maior Andar: " + maiorAndar + "\n" +
				"Menor Andar: " + menorAndar;
	}

	// <modificador> <tipo_retorno> <nome> (<tipo param> <nome param>)
	
	public void preencherMaiorAndar (int pAndar) {
		if (pAndar>menorAndar) {
			maiorAndar=pAndar;
		}
	}
	public void preencherMenorAndar (int pAndar) {
		if (pAndar<maiorAndar) {
			menorAndar=pAndar;
		}
	}
	public void preencherCapacidadePessoas (int pessoas) {
		if (pessoas>0) {
			capacidadePessoas=pessoas;
		}
	}
	public void subir() {
		if (andarAtual<maiorAndar) {
			andarAtual++;
		}
	}
	public void descer () {
		if (andarAtual>menorAndar) {
			andarAtual--;
		}
	}
	public void entrar (int qtde) {
		if ((qtdePessoas+qtde) <=capacidadePessoas) {
			qtdePessoas+=qtde;
		}
	}
	public void sair (int qtde) {
		if (qtde<=qtdePessoas) {
			qtdePessoas-=qtde;
		}
	}
}

