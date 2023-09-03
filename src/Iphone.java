public class Iphone implements ITelefone, IReprodutorMusical, INavegadorInternet {

    public Iphone() {
        System.out.println("IPhone instanciado!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A música '" + musica + "' foi selecionada!");
    }

    @Override
    public void ligar(String n) {
        System.out.println("Ligou para " + n);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado!");
    }
    
}
