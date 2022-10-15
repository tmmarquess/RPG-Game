package model;

import interfaces.ComportamentoNormal;

public abstract class Personagem implements ComportamentoNormal{

    private String nome;

    public Personagem(String nome){
        this.nome = nome;
    }

    @Override
    public abstract void andar();

    @Override
    public abstract void guardarItem();

    @Override
    public abstract void usarItem();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
