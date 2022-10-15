package model;

import interfaces.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico {

    public Mago(String nome) {
        super(nome);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void invisibilidade() {
        // TODO Auto-generated method stub
        System.out.println("Mago %s está invisível".formatted(getNome()));
    }

    @Override
    public void ultraRapidez() {
        // TODO Auto-generated method stub
        System.out.println("Mago %s está ultra rápido".formatted(getNome()));
    }

    @Override
    public void andar() {
        // TODO Auto-generated method stub
        System.out.println("Mago %s está andando".formatted(getNome()));
    }

    @Override
    public void guardarItem() {
        // TODO Auto-generated method stub
        System.out.println("Mago %s está guardando uma espada".formatted(getNome()));
    }

    @Override
    public void usarItem() {
        // TODO Auto-generated method stub
        System.out.println("Mago %s está usando um item".formatted(getNome()));
    }
    
}
