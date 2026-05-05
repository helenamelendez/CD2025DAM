package com.example;

public class Produto {
    private String nome;
    private Double prezo;

    public Produto(String nome, Double prezo){
        if (nome == null) {
            throw new IllegalArgumentException("o nome non pode ser null");
        }
        if (nome == "") {
            throw new IllegalArgumentException("o nome non pode ser valeiro");
        }
        if (prezo < 0) {
            throw new IllegalArgumentException("o prezo non pode ser negativo");
        }
        this.nome = nome;
        this.prezo = prezo;
    }

    public String getNome(){
        return this.nome;
    }

    public Double getPrezo(){
        return this.prezo;
    }

    public void setNome(String novoNome){
        if (novoNome == "") {
            throw new IllegalArgumentException("o nome non pode ser valeiro");
        }
        this.nome = novoNome;

    }

    public void setPrezo(Double novoPrezo){
        if (novoPrezo < 0) {
            throw new IllegalArgumentException("o prezo non pode ser negativo");
        }
        this.prezo = novoPrezo;
    }


}
