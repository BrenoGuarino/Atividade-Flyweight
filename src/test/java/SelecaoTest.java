
import org.example.ClubeFactory;
import org.example.Selecao;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelecaoTest {

    @Test
    void deveRetornarJogadores() {
        Selecao selecao = new Selecao();
        selecao.convocar("Lucas Piton", "Vasco");
        selecao.convocar("Paulo Henrique", "Vasco");
        selecao.convocar("Vinícius Júnior", "Real Madrid");
        selecao.convocar("Coutinho", "Vasco");

        List<String> saida = Arrays.asList(
                "Jogador{nome='Lucas Piton', clube='Vasco'}",
                "Jogador{nome='Paulo Henrique', clube='Vasco'}",
                "Jogador{nome='Vinícius Júnior', clube='Real Madrid'}",
                "Jogador{nome='Coutinho', clube='Vasco'}");

        assertEquals(saida, selecao.obterJogadores());
    }

    @Test
    void deveRetornarTotalClubes() {
        Selecao selecao = new Selecao();
        selecao.convocar("Lucas Piton", "Vasco");
        selecao.convocar("Paulo Henrique", "Vasco");
        selecao.convocar("Vinícius Júnior", "Real Madrid");
        selecao.convocar("Coutinho", "Vasco");

        assertEquals(2, ClubeFactory.getTotalClubes());
    }

}