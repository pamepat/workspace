package br.com.lojauati.teste;

import br.com.lojauati.modelo.Televis�o;

public class TesteTelevisao {

	public static void main(String[] args) {
		Televis�o tv = new Televis�o();
		tv.mudarCanal(50);
		System.out.println(tv.exibirTudo());
		tv.ligar();
		tv.mudarCanal(50);
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		System.out.println(tv.exibirTudo());
		tv.desligar();
		tv.diminuirVolume();
		System.out.println(tv.exibirTudo());
	}
}
