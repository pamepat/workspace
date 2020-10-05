package repeticao;

import javax.swing.JOptionPane;

public class DesafioRepeticao {
	/*
	 * Jogador 1 vai digitar um n�mero
	 * Jogador 2 vai descobrir o n�mero
	 * Exibir o Parabens jogador2 qnd ele descobrir
	 * Atualiza��es
	 * - o jogador 2 ir� receber dicas enquanto ele na�o acertar
	 * - no final tem que exibir qnts tentativas foram utilizadas pelo jogador 2
	 */

	public static void main(String[] args) {
		int tentativas=0;
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor Jogador 1"));
		int valor2=0;
		do {
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor Jogador 2"));
		if (valor2>valor1) {
			System.out.println("Continue tentando, o n�mero que voc� digitou � maior do que a resposta correta");
		}else if (valor2<valor1) {
		System.out.println("Continue tentando, o valor que voc� digitou � menor do que a resposta correta");
	}
		tentativas=tentativas+1;
		}while (valor1!=valor2);
		System.out.println("Parab�ns, voc� acertou usando " + tentativas + " tentativas!");
}
}
