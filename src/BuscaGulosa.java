public class BuscaGulosa {
    private Problema problema;

    public BuscaGulosa(Problema problema) {
        this.problema = problema;
    }

    public void solucao(){
        printInicial();

        int capacidade = problema.getMochila().getCapacidade();
        int peso = 0;
        int qtdObjetos = 0;

        System.out.println("\n******************************************************");
        for (int i = 0; i < problema.getObjetos().size(); i++) {
            Objeto objeto = problema.getObjetos().get(i);
            if (peso + objeto.getPeso() <= capacidade) {
                peso += objeto.getPeso();
                qtdObjetos++;

                System.out.println("--> Objeto " + (i + 1) + " de peso " + objeto.getPeso() + " adicionado à mochila");
                System.out.println("- Peso total: " + peso);
                System.out.println("- Espaço restante: " + (capacidade - peso));
            }
        }
        System.out.println("******************************************************");

        System.out.println("\n** Peso total: " + peso);
        System.out.println("** Quantidade de objetos: " + qtdObjetos);
        System.out.println("** Espaço restante: " + (capacidade - peso));
    }

    //Exibe a capacidade da mochila e os objetos disponíveis
    public void printInicial() {
        System.out.println("\n** Capacidade da mochila: " + problema.getMochila().getCapacidade());
        System.out.println("** Objetos disponíveis:");

        for (int i = 0; i < problema.getObjetos().size(); i++) {
            System.out.println("- Objeto " + (i + 1) + ": " + problema.getObjetos().get(i).getPeso());
        }
    }
}
