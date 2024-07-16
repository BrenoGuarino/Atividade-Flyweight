package org.example;

public class Jogador {

    private String nome;
    private Clube clubeAtual;

    public Jogador(String nome, Clube clubeAtual) {
        this.nome = nome;
        this.clubeAtual = clubeAtual;
    }

    public String obterJogador() {
        return "Jogador{" +
                "nome='" + this.nome + '\'' +
                ", clube='" + clubeAtual.getNome() + '\'' +
              //  ", uf='" + cidadeResidencia.getUf() + '\'' +
                '}';
    }
}