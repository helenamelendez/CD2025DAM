``` mermaid
classDiagram
    class XestorNotas {
        - String alumno
        - double[] notas
     
        + double calcularMedia()
        + double calcularMaximo()
        + boolean estaAprobado()
        + int contarSuspensos()
    }

```