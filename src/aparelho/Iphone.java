package aparelho;

import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone {
	public static void main(String[] args) {
		ReprodutorMusical msc = new ReprodutorMusical();
		msc.tocar();
		msc.pausar();
		msc.selecionaMusica();
		
		NavegadorInternet browser = new NavegadorInternet();
		browser.exibirPagina();
		browser.adicionarNovaAba();
		browser.atualizarPagina();
		
		AparelhoTelefonico  telefone = new AparelhoTelefonico();
		telefone.ligar();
		telefone.atender();
		telefone.iniciarCorreioVoz();
		
	}
}