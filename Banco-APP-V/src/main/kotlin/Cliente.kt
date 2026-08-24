class Cliente (
    val nombre: String,
    val rut: String
){
    //Crear una funcion para mostrar informacion => toString

    fun mostrarInformacion() {
        println("nombre: $nombre")
        println("rut: $rut")
    }

}