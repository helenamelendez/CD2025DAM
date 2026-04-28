package A25HelenaMS

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AutorTest {

    @Test
    fun `autor puede escribir libros`() {
        val autor = Autor("George Orwell", "Británica", "1903-06-25")
        val libro = Libro("1984", "Novela", "Editorial", 1949)

        autor.escribirLibro(libro)

        assertEquals(1, autor.obtenerLibros().size)
    }
}