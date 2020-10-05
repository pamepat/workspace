package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		Endereco endereco = new Endereco ();
		endereco.setLogradouro (JOptionPane.showInputDialog("Logradouro"));
		endereco.setBairro (JOptionPane.showInputDialog("Bairro"));
		endereco.setCidade (JOptionPane.showInputDialog("Cidade"));
		
		Professor professor = new Professor ();
		professor.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("ID")), 
				JOptionPane.showInputDialog("Nome").toUpperCase(), 
				Float.parseFloat(JOptionPane.showInputDialog("Valor Hora")),
				JOptionPane.showInputDialog("Forma��o").toUpperCase(),
				endereco
				);
		System.out.println(professor.getAll());

	}
}

