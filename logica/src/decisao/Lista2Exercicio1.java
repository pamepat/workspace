package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {
	/*
	1. Um hotel cobra R$ 80,00 a diária e mais uma taxa de serviços. 
	A taxa de serviços é de: 
	R$ 5,50 por diária, se o número de diárias for maior que 15; 
	R$ 6,00 por diária, se o número de diárias for igual a 15; 
	R$ 8,00 por diária, se o número de diárias for menor que 15.
	Monte uma aplicação que apresente a conta do cliente.
	*/

	public static void main(String[] args) {
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Quantidade de diárias"));
		
		float taxa = 0;
		if (diarias>15) {
			taxa = (float) 5.5;
		} else if (diarias<15) {
			taxa = 8;
		}else {
			taxa = 6;	
		}
		float valor = 80 + taxa;
		System.out.println("Total: " + (valor*diarias));
		
	}
}
		
		
		
