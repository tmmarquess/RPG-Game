package model;

import interfaces.ComportamentoFeroz;

public class Dragao extends Personagem implements ComportamentoFeroz{

    public Dragao(String nome) {
        super(nome);
    }

    @Override
    public void atirarFogo() {
        System.out.println("Dragão %s está atirando fogo".formatted(getNome()));
    }

    @Override
    public void voar() {
        System.out.println("Dragão %s está voando".formatted(getNome()));
    }

    @Override
    public void morder() {
        System.out.println("Dragão %s está mordendo".formatted(getNome()));
    }

    @Override
    public void andar() {
        System.out.println("Dragão %s está andando".formatted(getNome()));
    }

    @Override
    public void guardarItem() {
        System.out.println("Dragão %s está guardando uma erva de cura".formatted(getNome()));
    }

    @Override
    public void usarItem() {
        System.out.println("Dragão %s está usando uma erva de cura".formatted(getNome()));
    }
    
}
