package A25HelenaMS

class Lector(
    val numSocio: Int,
    val nombre: String,
    val apellidos: String,
    val direccion: String
) {
    private val prestamos = mutableListOf<Prestamo>()
    private val multas = mutableListOf<Multa>()

    fun realizarPrestamo(copia: Copia, fechaInicio: String): Prestamo? {
        if (prestamos.size >= 3 || comprobarMultasPendientes()) return null

        val prestamo = Prestamo(fechaInicio, copia, this)
        prestamos.add(prestamo)
        copia.prestar()
        return prestamo
    }

    fun agregarMulta(multa: Multa) {
        multas.add(multa)
    }

    fun comprobarMultasPendientes(): Boolean {
        return multas.isNotEmpty()
    }
}