package Services;

public class ServicoAparelhoTelefonico {

    public ServicoAparelhoTelefonico() {
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo Chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Deixe sua mensagem após o Sinal");
    }
}
