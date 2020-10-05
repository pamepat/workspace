package br.com.lojauati.modelo;

public class Formula1 {
	private String escuderia;
	private float valor;
	private int rpm;
	
	// criem os metodos para preencher o rpm e o valor e os metodos para exibir rpm e valor
	// Crie um método para preencher todos os atributos - preencherTudo()
	// Crie um método para exibir todos os atributos - exibirTudo()
	// Crie um método para exibir o valor com um desconto de 10% - exibirPromocao()
	// Crie um método para exibir o valor com um desconto que será
	// recebido por parâmetro - exibirPromocao()
	
	public String exibirTudo () {
		return escuderia + "\n" + valor + "\n" + rpm;
	}
	
	public void preencherTudo (String p1, float p2, int p3) {
		escuderia=p1;
		valor=p2;
		rpm=p3;
	}
	
	public float exibirPromocao() {
		return (float) (valor*0.9);
	}
	
	public float exibirPromocao (float porc) {
		return valor - valor * (porc/100);
	}	
	
	public int exibirRpm () {
		return rpm;
	}
	
	public float exibirValor() {
		return valor;
	}
	
	public void preencherValor(float parametro) {
		if (parametro >0) {
			valor=parametro;
		}
	}
	
	public void preencherRpm (int parametro) {
		rpm=parametro;
	}
	
	public String exibirEscuderia() {
		return escuderia;	
	}
	
	// Sintaxe para criação de metodos java
	// <modificador> <tipo do retorno> <nome do metodo> (<tipo do parametro)
	
	public void preencherEscuderia (String parametro) {
		escuderia = parametro.toUpperCase();
	}
	

}
