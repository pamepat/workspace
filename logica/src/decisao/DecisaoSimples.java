package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	/*
	 * Identificadores = nomes (classe, variavel...)
	 * Regras:
	 * 1� N�o come�ar�s com n�mero
	 * 2� N�o usar�s caracteres especiais (@,#; ~) Exce��o: underline (_)
	 * 3� N�o utilizar�s palavras reservadas da linguagem (class, int, main, public)
	 * 
	 * Padroes (variaveis)
	 * - nomes significativos
	 * - sempre come�am com letras minusculas
	 * - utilizar o padrao Camel case
	 */

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float media = (nota1 + nota2) / 2;
		System.out.println("Aluno: " + nome + " sua m�dia foi: " + media);
		if (media>=6) {
			System.out.println("Parabens " + nome + "Voc� est� aprovado");
		}
		if (media<4) {
			System.out.println("Infelizmente " + nome +  " voc� foi reprovado.");
		}
		if (media<6 && media>=4) {
			System.out.println(nome + " Voc� ainda tem chance no exame!");
		}
		
		// and => &&
		// or => ||
		// se a media estiver entre 5.9 e 4 tem que mostrar:
		// "xxx voc� ainda tem chance no exame"
		
	


}

}
