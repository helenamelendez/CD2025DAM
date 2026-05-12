package com.example;

/**
 * Clase que almancena la informacion de un producto
 * @author A25HelenaMS
 */
public class Produto {
    /** nombre del producto */
    private String nome;
    /** precio del producto */
    private Double prezo;

    /** Constructor con dos parametros
     *  realiza comprobaciones sobre el nombre y el precio antes de asignarlos
     *  en caso de no cumplir los criterios lanza una excepcion 
     */
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

    /**
     * getter de nome
     * @return  nombre del producto
     */
    public String getNome(){
        return this.nome;
    }

    /**
     * getter de prezo
     * @return precio del producto
     */
    public Double getPrezo(){
        return this.prezo;
    }

    /**
     * setter de nome
     * @param novoNome nuevo nombre a asignar
     * realiza comprobaciones antes de la asignacion
     */
    public void setNome(String novoNome){
        if (novoNome == "") {
            throw new IllegalArgumentException("o nome non pode ser valeiro");
        }
        this.nome = novoNome;

    }

    /**
     * setter de prezo
     * @param novoPrezo nuevo precio a asignar
     * realiza comprobaciones antes de la asignacion
     */
    public void setPrezo(Double novoPrezo){
        if (novoPrezo < 0) {
            throw new IllegalArgumentException("o prezo non pode ser negativo");
        }
        this.prezo = novoPrezo;
    }


}
