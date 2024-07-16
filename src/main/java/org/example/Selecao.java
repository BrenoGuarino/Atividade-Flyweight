package org.example;

import java.util.ArrayList;
import java.util.List;

public class Selecao {

    private List<Jogador> jogadores = new ArrayList<>();

    public void convocar(String nomeJogador, String nomeClube) {
        Clube cidade = ClubeFactory.getClube(nomeClube);
        Jogador jogador = new Jogador(nomeJogador, cidade);
        jogadores.add(jogador);
    }

    public List<String> obterJogadores() {
        List<String> saida = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            saida.add(jogador.obterJogador());
        }
        return saida;
    }


}