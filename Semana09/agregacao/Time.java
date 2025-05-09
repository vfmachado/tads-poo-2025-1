package agregacao;

import java.util.List;

public class Time {
    private List<Jogador> jogadores;

    public void contratar(Jogador jogador) {
        this.jogadores.add(jogador);
    }
}
