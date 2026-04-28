``` mermaid
classDiagram
    class ContaBancaria {
        - String titular
        - double saldo
        - int numeroOperacions
        
        + void ingresar()
        + boolean retirar()
        + double calcularComision()
        + void aplicarComision()
    }

```