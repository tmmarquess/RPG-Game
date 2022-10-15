import java.util.ArrayList;

import model.Cavaleiro;
import model.Dragao;
import model.Mago;
import model.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Personagem> personagens = new ArrayList<>();
        Jogo jogo = new Jogo();

        personagens.add(new Cavaleiro("Maximus"));
        personagens.add(new Cavaleiro("Miya"));

        personagens.add(new Dragao("Naty"));
        personagens.add(new Dragao("Anya"));

        personagens.add(new Mago("bibi"));
        personagens.add(new Mago("Thithi"));

        jogo.ControlarAcaoDosPersonagens(personagens);

        Personagem p = new Mago("Perdiz");

        ((Mago) p).invisibilidade();
    }
}
