import java.util.List;

import model.Personagem;

public class Jogo {

    public void ControlarAcaoDosPersonagens(List<Personagem> personagens){
        for (Personagem personagem : personagens){
            System.out.println("===============================");
            personagem.andar();
            personagem.guardarItem();
            personagem.usarItem();
            System.out.println("===============================");
        }
    }
}
