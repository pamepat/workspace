package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	/*
	 * Identificadores = nomes (classe, variavel...)
	 * Regras:
	 * 1º Não começarás com número
	 * 2º Não usarás caracteres especiais (@,#; ~) Exceção: underline (_)
	 * 3º Não utilizarás palavras reservadas da linguagem (class, int, main, public)
	 * 
	 * Padroes (variaveis)
	 * - nomes significativos
	 * - sempre começam com letras minusculas
	 * - utilizar o padrao Camel case
	 */

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float media = (nota1 + nota2) / 2;
		System.out.println("Aluno: " + nome + " sua média foi: " + media);
		if (media>=6) {
			System.out.println("Parabens " + nome + "Você está aprovado");
		}
		if (media<4) {
			System.out.println("Infelizmente " + nome +  " você foi reprovado.");
		}
		if (media<6 && media>=4) {
			System.out.println(nome + " Você ainda tem chance no exame!");
		}
		
		// and => &&
		// or => ||
		// se a media estiver entre 5.9 e 4 tem que mostrar:
		// "xxx você ainda tem chance no exame"
		
	


}

}
