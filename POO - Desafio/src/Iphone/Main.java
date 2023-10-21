package Iphone;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Música 1");

        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegador = new NavegadorInternetImpl();
        navegador.adicionarNovaAba("https://www.dio.com");	
        navegador.exibirPagina("https://www.exemplo.com");    
        navegador.atualizarPagina();
    }
}
