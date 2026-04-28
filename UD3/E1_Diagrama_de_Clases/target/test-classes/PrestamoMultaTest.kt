package A25HelenaMS

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PrestamoMultaTest {

    @Test
    fun `generar multa la asocia al lector`() {
        val libro = Libro("1984", "Novela", "Editorial", 1949)
        val copia = Copia(1, "DISPONIBLE", libro)
        val lector = Lector(1, "Ana", "Pérez", "Dirección")

        val prestamo = lector.realizarPrestamo(copia, "2026-02-01")!!
        val multa = prestamo.generarMulta()

        assertNotNull(multa)
        assertTrue(lector.comprobarMultasPendientes())
    }

    @Test
    fun `finalizar prestamo devuelve la copia`() {
        val libro = Libro("1984", "Novela", "Editorial", 1949)
        val copia = Copia(1, "DISPONIBLE", libro)
        val lector = Lector(1, "Ana", "Pérez", "Dirección")

        val prestamo = lector.realizarPrestamo(copia, "2026-02-01")!!
        prestamo.finalizarPrestamo()

        assertEquals("DISPONIBLE", copia.estado)
    }
}