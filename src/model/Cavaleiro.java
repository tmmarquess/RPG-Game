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
        // TODO Auto-generated constructor stub
    }

    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        System.out.println("Cavaleiro %s está atacando".formatted(getNome()));
    }

    @Override
    public void defender() {
        // TODO Auto-generated method stub
        System.out.println("Cavaleiro %s está se defendendo".formatted(getNome()));
    }

    @Override
    public void saltar() {
        // TODO Auto-generated method stub
        System.out.println("Cavaleiro %s está pulando".formatted(getNome()));
    }

    @Override
    public void andar() {
        // TODO Auto-generated method stub
        System.out.println("Cavaleiro %s está andando".formatted(getNome()));
    }

    @Override
    public void guardarItem() {
        // TODO Auto-generated method stub
        System.out.println("Cavaleiro %s está guardando uma espada".formatted(getNome()));
    }

    @Override
    public void usarItem() {
        // TODO Auto-generated method stub
        System.out.println("Cavaleiro %s está usando um item".formatted(getNome()));
    }

}
