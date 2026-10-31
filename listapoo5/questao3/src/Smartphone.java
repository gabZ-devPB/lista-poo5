public class Smartphone implements AparelhoTelefonico,
        NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Realizando ligação...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
}