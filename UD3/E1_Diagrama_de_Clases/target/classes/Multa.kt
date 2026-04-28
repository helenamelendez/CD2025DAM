package A25HelenaMS

class Multa(
    val fechaInicio: String,
    val lector: Lector
) {
    var fechaFin: String? = null

    fun calcularFechaFin() {
        fechaFin = "2026-03-01" // ejemplo
    }
}