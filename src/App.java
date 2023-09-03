import models.Iphone;
import models.interfaces.INavegadorInternet;
import models.interfaces.IReprodutorMusical;
import models.interfaces.ITelefone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        if (iphone instanceof ITelefone) {
            iphone.ligar("(34)91234-5678");
            iphone.atender();
            iphone.iniciarCorreioVoz();
        }
        
        if (iphone instanceof IReprodutorMusical) {
            iphone.selecionarMusica("Metallica - Nothing Else Matters");
            iphone.tocar();
            iphone.pausar();
        }

        if (iphone instanceof INavegadorInternet) {
            iphone.exibirPagina();
            iphone.atualizarPagina();
            iphone.adicionarNovaAba();
        }
    }
}
