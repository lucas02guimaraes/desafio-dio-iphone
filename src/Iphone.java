import Services.*;

public class Iphone {
    public static void main(String[] args) {
        ServicoReprodutorMusical reprodutorMusical = new ServicoReprodutorMusical();
        ServicoAparelhoTelefonico aparelhoTelefonico = new ServicoAparelhoTelefonico();
        ServicoNavegadorInternet navegadorInternet = new ServicoNavegadorInternet();

        reprodutorMusical.selecionarMusica("In The End - Link Park");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        aparelhoTelefonico.ligar("(00)00001-0002");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorInternet.exibirPagina("www.Google.com");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}
