package A25HelenaMS

class Autor(
    val nombre: String,
    val nacionalidad: String,
    val fechaNacimiento: String
) {
    private val libros = mutableListOf<Libro>()

    fun escribirLibro(libro: Libro) {
        libros.add(libro)
    }

    fun obtenerLibros(): List<Libro> {
        return libros
    }
}