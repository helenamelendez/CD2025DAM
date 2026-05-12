package com.example;

import java.util.ArrayList;

/**
 * Clase que almancena la informacion de un Carrito de la compra
 * @author A25HelenaMS
 */
public class CarrinhoCompra {

    /**Lista de productos*/
    private ArrayList<Produto> listaProducto = new ArrayList<Produto>();

    /**
     * Funcion que recibe un Producto y lo añade a la lista
     * @param p Producto a almacenar
     */
    public void engadirProduto(Produto p){
        this.listaProducto.add(p);
    }

    /**
     * Funcion que calcula el precio total de los productos almacenados
     * @return total del precio de los productos
     */
    public Double calcularTotal(){
        Double total = 0.0;
        for (int i = 0; i < listaProducto.size(); i++) {
            total += listaProducto.get(i).getPrezo();
        }
        return total;
    }
    
    /**
     * Funcion que devuleve el numero total de los productos almacenados
     * @return  total de productos en el carrito
     */
    public int getNumeroProdutos(){
        return listaProducto.size();
    }

    /**
     * Funcion que elimina un producto de la lista de productos
     * @param p Recive un producto a eliminar 
     */
    public void eliminarProduto(Produto p){
        this.listaProducto.remove(p);
    }

}
