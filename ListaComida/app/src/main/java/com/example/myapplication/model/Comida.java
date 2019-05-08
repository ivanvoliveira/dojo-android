package com.example.myapplication.model;

public class Comida {
    private String nome, descricao;
    private int nota;

    public Comida(){
    }

    public Comida(String nome, String descricao, int nota) {
        this.nome = nome;
        this.descricao = descricao;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
