package A25HelenaMS

class Libro(
    val nombre: String,
    val tipo: String,
    val editorial: String,
    val anio: Int
) {
    private val copias = mutableListOf<Copia>()

    fun agregarCopia(copia: Copia) {
        copias.add(copia)
    }

    fun obtenerCopias(): List<Copia> {
        return copias
    }
}