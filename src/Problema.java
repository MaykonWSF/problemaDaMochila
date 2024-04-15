import java.util.ArrayList;
import java.util.List;

public class Problema {
    private Mochila mochila;
    private List<Objeto> objetos;

    public Problema(Mochila mochila, int objetos) {
        this.mochila = mochila;
        this.objetos = new ArrayList<>();
        
        // Adiciona objetos aleatórios
        for (int i = 0; i < objetos; i++) {
            this.objetos.add(new Objeto((int) (Math.random() * 100) + 1));
        }

        // Ordena os objetos por peso em ordem decrescente
        this.objetos.sort((o1, o2) -> o2.getPeso() - o1.getPeso());
    }

    // Retorna o último objeto da lista
    public Objeto getUltimoObjeto() {
        return objetos.get(objetos.size() - 1);
    }

    // Getters
    public Mochila getMochila() {
        return mochila;
    }

    public List<Objeto> getObjetos() {
        return objetos;
    }
}