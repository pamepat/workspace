package repeticao;

import javax.swing.JOptionPane;

public class ExercicioGeral {

	public static void main(String[] args) {
		char resposta=0;
		String nome="";
		short idade=0;
		int qtdeMaiores=0;
		int totalIdades=0;
		int qtdePessoas=0;	
		String nomeJovem="";
		String nomeExperiente="";
		int idadeJovem=0;
		int idadeExperiente=0;
		do {
			nome = JOptionPane.showInputDialog("Nome").toUpperCase();
			idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
			if (qtdePessoas==1) {
				nomeExperiente = nome;
				idadeExperiente = idade;
				nomeJovem = nome;
				idadeJovem = idade;
			}else {
				if (idade>idadeExperiente) {
					nomeExperiente = nome;
					idadeExperiente = idade;
				}
				if (idade<idadeJovem) {
					nomeJovem = nome;
					idadeJovem = idade;
				}

				if (idade>17) {
					qtdeMaiores++;
				}
				totalIdades=totalIdades+idade;
				qtdePessoas++;
			}
				resposta = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase().charAt(0);
			}while (resposta== 'S');
			
			System.out.println("Qtde de pessoas maiores de idade: " + qtdeMaiores);
			System.out.println("Média de idade: " + (totalIdades/qtdePessoas));
			System.out.println(nomeExperiente + " é o mais experiente com " + idadeExperiente + " anos");
			System.out.println(nomeJovem + " é o mais jovem com " + idadeJovem+ " anos");
		}

	}