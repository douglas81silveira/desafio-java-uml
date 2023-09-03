import models.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.ligar("(34)91234-5678");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.selecionarMusica("Metallica - Nothing Else Matters");
        iphone.tocar();
        iphone.pausar();
        
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}
