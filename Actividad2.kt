fun estaAprobado(nota: Double): Boolean {
    return nota >= 4.0
}

fun main() {
    val notas = listOf(6.5, 3.8, 4.0, 5.2, 2.9)

    println("Notas registradas:")
    for (nota in notas) {
        println(nota)
    }

    val notasAprobadas = notas.filter { nota -> estaAprobado(nota) }
    println("Notas aprobadas: $notasAprobadas")

    val promedio = notas.average()
    println("Promedio del curso: $promedio")

    val primeraNota = notas[0]
    println("¿La nota $primeraNota está aprobada? ${estaAprobado(primeraNota)}")
}
