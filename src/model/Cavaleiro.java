package model;

import interfaces.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {

    /*
     * Implemente os métodos da classe Cavaleiro de tal forma que cada método emita
     * uma mensagem. Por exemplo, a operação guardarItem() pode emitir a mensagem
     * “Cavaleiro Máximos está guardando uma espada”
     */

    public Cavaleiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println("Cavaleiro %s está atacando".formatted(getNome()));
    }

    @Override
    public void defender() {
        System.out.println("Cavaleiro %s está se defendendo".formatted(getNome()));
    }

    @Override
    public void saltar() {
        System.out.println("Cavaleiro %s está pulando".formatted(getNome()));
    }

    @Override
    public void andar() {
        System.out.println("Cavaleiro %s está andando".formatted(getNome()));
    }

    @Override
    public void guardarItem() {
        System.out.println("Cavaleiro %s está guardando uma espada".formatted(getNome()));
    }

    @Override
    public void usarItem() {
        System.out.println("Cavaleiro %s está usando a espada".formatted(getNome()));
    }

}
