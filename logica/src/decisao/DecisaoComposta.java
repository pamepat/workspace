package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		// vao pedir o total de faltas
		// se o total de faltas for maior que 20, o aluno est� reprovado
		// independente da media
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float media = (nota1 + nota2) / 2;
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite o total de faltas"));
		System.out.println("Aluno: " + nome + " sua m�dia foi: " + media + " suas faltas foram: " + faltas);
		if (faltas>20) {
			System.out.println("Voc� foi reprovado por falta");
		}
		else if (media>=6) {
			System.out.println("Parabens " + nome + "Voc� est� aprovado");
		}else if (media<4) {
			System.out.println("Infelizmente " + nome +  " voc� foi reprovado.");
		}else if (media<6 && media>=4) {
			System.out.println(nome + " Voc� ainda tem chance no exame!");
		}
		
		// and => &&
		// or => ||
		// se a media estiver entre 5.9 e 4 tem que mostrar:
		// "xxx voc� ainda tem chance no exame"
		
	


}

}