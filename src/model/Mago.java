package model;

import interfaces.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico {

    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void invisibilidade() {
        System.out.println("Mago %s está invisível".formatted(getNome()));
    }

    @Override
    public void ultraRapidez() {
        System.out.println("Mago %s está ultra rápido".formatted(getNome()));
    }

    @Override
    public void andar() {
        System.out.println("Mago %s está andando".formatted(getNome()));
    }

    @Override
    public void guardarItem() {
        System.out.println("Mago %s está guardando uma bola de cristal".formatted(getNome()));
    }

    @Override
    public void usarItem() {
        System.out.println("Mago %s está usando uma bola de cristal".formatted(getNome()));
    }
    
}
