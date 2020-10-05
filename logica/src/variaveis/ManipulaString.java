package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		//String é do tipo Referência
		String email = JOptionPane.showInputDialog("Email");
		System.out.println("Original:" + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Posiçao do @:" +email.indexOf("@"));
		System.out.println("Existe @:" + email.contains("@"));
		System.out.println("Qtde caracteres: " + email.length());
		System.out.println("Do 2 ao 4: " + email.substring(1,4));
		System.out.println("A partir do 2º: " + email.substring(1));
		System.out.println("Usuario: " + email.substring(0, email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1));
		
		//retornar somente o servidor
				
	System.out.println("Servidor Principal: " + email.substring(email.indexOf("@")+1,email.indexOf(".com")));
	
	//retornar a primeira metade do email
	
	System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
	System.out.println("Comparação Com Case Sensitive: " + (email.equals("abc@xpto.com.br")));
	System.out.println("Comparação Sem Case Sensitive: " + (email.equalsIgnoreCase("abc@xpto.com.br")));
	
	
		
		
		
		
		
		
		
		
	}

}
