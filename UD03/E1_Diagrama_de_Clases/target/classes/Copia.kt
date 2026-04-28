package A25HelenaMS

class Copia(
    val identificador: Int,
    var estado: String,
    val libro: Libro
) {
    init {
        libro.agregarCopia(this)
    }

    fun prestar() {
        estado = "PRESTADA"
    }

    fun devolver() {
        estado = "DISPONIBLE"
    }
}