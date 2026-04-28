package A25HelenaMS

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LectorPrestamoTest {

    @Test
    fun `lector puede realizar un prestamo si no tiene multas`() {
        val libro = Libro("1984", "Novela", "Editorial", 1949)
        val copia = Copia(1, "DISPONIBLE", libro)
        val lector = Lector(1, "Ana", "Pérez", "Calle Falsa 123")

        val prestamo = lector.realizarPrestamo(copia, "2026-02-01")

        assertNotNull(prestamo)
        assertEquals("PRESTADA", copia.estado)
    }

    @Test
    fun `lector no puede tener mas de 3 prestamos`() {
        val libro = Libro("Libro", "Tipo", "Editorial", 2020)
        val lector = Lector(1, "Ana", "Pérez", "Dirección")

        repeat(3) {
            lector.realizarPrestamo(
                Copia(it, "DISPONIBLE", libro),
                "2026-02-01"
            )
        }

        val cuartoPrestamo = lector.realizarPrestamo(
            Copia(4, "DISPONIBLE", libro),
            "2026-02-01"
        )

        assertNull(cuartoPrestamo)
    }
}