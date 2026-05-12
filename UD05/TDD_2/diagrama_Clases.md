``` mermaid 
classDiagram
class CarrinhoCompra {
    - ArrayList<Produto> listaProducto

    + void engadirProduto()
    + Double calcularTotal()
    + int getNumeroProdutos()
    + void eliminarProduto()
}

class Producto {
    - String nome
    - Double prezo

    + String getNome()
    + Double getPrezo()
    + void  setNome()
    + void setPrezo()
}

CarrinhoCompra "*" --> "*" Producto : tiene producto

```

