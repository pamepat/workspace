package br.com.execao.teste;

public class TesteExecao {

	public static void main(String[] args) {
		try {
		int numero = Integer.parseInt("7");
		System.out.println(numero);
		
		String palavra = "";
		System.out.println(palavra.length());
		
		int valores []= new int [2];
		valores [0] = 548;
		valores [1] = 112;
		valores [2] = 95; 
		
		} catch (NumberFormatException e) {
			System.out.println("Número inválido");
		} catch (NullPointerException e) {
			System.out.println("Objeto nulo");
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Vetor estourou");
		} catch (Exception e) {
			System.out.println("Exceção desconhecida");
		}

	}

}
