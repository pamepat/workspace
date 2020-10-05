package br.com.lojauati.modelo;

public class Televisão {
	private int canal;
	private boolean status;
	private int volume;

	public String exibirTudo () {
		String resposta="DESLIGADA";
		if (status==true) {
			resposta="LIGADA";
		}
		return
				"Status: " + resposta + "\n" +
				"Canal: " + canal + "\n" +
				"Volume: " + volume;
	}

	public boolean exibirStatus () {
		return status;
	}

	public void desligar () {
		status = false;
	}

	public void ligar () {
		status=true;
	}

	public void mudarCanal (int novoCanal) {
		if (status==true) {
			canal=novoCanal;
		}
	}

	public void diminuirVolume () {
		if (volume>0 && status==true) {
			volume--;
		}
	}

	public void aumentarVolume () {
		if (status==true)
			volume++;
	}
}


