package Services;

public class ServicoReprodutorMusical {

    public ServicoReprodutorMusical() {
    }

    public void tocar() {
        System.out.println("Tocando Musica");
    }

    public void pausar() {
        System.out.println("Pausando a Musica");
    }

    public void selecionarMusica(String musica) {
        System.out.println(musica + " Foi Selecionada");
    }
}
