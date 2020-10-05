package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente ();
		Endereco endereco = new Endereco ();
		endereco.setLogradouro (JOptionPane.showInputDialog("Logradouro"));
		endereco.setBairro (JOptionPane.showInputDialog("Bairro"));
		endereco.setCidade (JOptionPane.showInputDialog("Cidade"));
		endereco.setEstado (JOptionPane.showInputDialog("Estado"));
		endereco.setCep (JOptionPane.showInputDialog("Cep"));
		endereco.setNumero (JOptionPane.showInputDialog("Numero"));
		endereco.setComplemento (JOptionPane.showInputDialog("Complemento"));
	
		cliente.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("ID")), 
				JOptionPane.showInputDialog("Nome"),
				endereco
				);
		System.out.println(cliente.getAll());
	}

}
