package A25HelenaMS

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LibroCopiaTest {

    @Test
    fun `al crear una copia se agrega al libro`() {
        val libro = Libro("1984", "Novela", "Secker & Warburg", 1949)
        Copia(1, "DISPONIBLE", libro)

        assertEquals(1, libro.obtenerCopias().size)
    }

    @Test
    fun `prestar y devolver cambia el estado de la copia`() {
        val libro = Libro("1984", "Novela", "Editorial", 1949)
        val copia = Copia(1, "DISPONIBLE", libro)

        copia.prestar()
        assertEquals("PRESTADA", copia.estado)

        copia.devolver()
        assertEquals("DISPONIBLE", copia.estado)
    }
}