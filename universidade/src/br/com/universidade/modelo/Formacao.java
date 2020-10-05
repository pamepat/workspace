package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

/*
* Polimorfismo: metodos com os mesmos nomes e ações diferentes
* Overload (sobrecarga): qns os metodos estao na mesma classe
* Override (sobrescrita): qnd os métodos estão em classes diferentes
*/


public abstract class Formacao implements PadraoFormacao {
	private float valor;
	private String descricao;
	private int duracao;
	
	
	public String getAll() {
		 return
				 "valor: " + valor + "\n" +
				 "descricao: " + descricao + "\n" +
				 "duracao: " + duracao;
	}
	
	public void setAll(float valor, String descricao, int duracao) {
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
	}
	
	
	public Formacao() {
		super();
	}
	
	public Formacao(float valor, String descricao, int duracao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public double calcularMensalidade(float fator) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void definirDuracao() {
		// TODO Auto-generated method stub
		
	}
	

}
