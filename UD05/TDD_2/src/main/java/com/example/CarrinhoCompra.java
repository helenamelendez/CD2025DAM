package com.example;

import java.util.ArrayList;

public class CarrinhoCompra {
    private ArrayList<Produto> listaProducto = new ArrayList<Produto>();

    public void engadirProduto(Produto p){
        this.listaProducto.add(p);
    }

    public Double calcularTotal(){
        Double total = 0.0;
        for (int i = 0; i < listaProducto.size(); i++) {
            total += listaProducto.get(i).getPrezo();
        }
        return total;
    }
    
    public int getNumeroProdutos(){
        return listaProducto.size();
    }

    public void eliminarProduto(Produto p){
        this.listaProducto.remove(p);
    }

}
