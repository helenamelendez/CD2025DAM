package A25HelenaMS

class Prestamo(
    val fechaInicio: String,
    val copia: Copia,
    val lector: Lector
) {
    var fechaFin: String? = null

    fun calcularFechaFin() {
        fechaFin = "2026-02-21" // ejemplo
    }

    fun generarMulta(): Multa {
        val multa = Multa(fechaInicio, lector)
        lector.agregarMulta(multa)
        return multa
    }

    fun finalizarPrestamo() {
        copia.devolver()
    }
}