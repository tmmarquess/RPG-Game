package model;

import interfaces.ComportamentoFeroz;

public class Dragao extends Personagem implements ComportamentoFeroz{

    public Dragao(String nome) {
        super(nome);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void atirarFogo() {
        // TODO Auto-generated method stub
        System.out.println("Dragão %s está atirando fogo".formatted(getNome()));
    }

    @Override
    public void voar() {
        // TODO Auto-generated method stub
        System.out.println("Dragão %s está voando".formatted(getNome()));
    }

    @Override
    public void morder() {
        // TODO Auto-generated method stub
        System.out.println("Dragão %s está mordendo".formatted(getNome()));
    }

    @Override
    public void andar() {
        // TODO Auto-generated method stub
        System.out.println("Dragão %s está andando".formatted(getNome()));
    }

    @Override
    public void guardarItem() {
        // TODO Auto-generated method stub
        System.out.println("Dragão %s está guardando uma espada".formatted(getNome()));
    }

    @Override
    public void usarItem() {
        // TODO Auto-generated method stub
        System.out.println("Dragão %s está usando um item".formatted(getNome()));
    }
    
}
