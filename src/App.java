public class App {
    public static void main(String[] args) throws Exception {
        Problema problema = new Problema(new Mochila(100), 10);
        BuscaGulosa buscaGulosa = new BuscaGulosa(problema);

        buscaGulosa.solucao();
    }
}
