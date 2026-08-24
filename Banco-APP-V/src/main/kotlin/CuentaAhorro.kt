class CuentaAhorro (
    numeroCuenta: Int,
    cliente: Cliente,
    saldoInicial: Double,
    val tasaInteres: Double
    // () : nombreClasePadre(atributos a heredar....)

) : CuentaBancaria(numeroCuenta, cliente, saldoInicial) {

    //heredar el metodo de la clase padre
    //sobreeescribir un metodo en java = @override
    override fun mostrarTipoCuenta() {
        println("Cuenta de Ahorro")
        println("Tasa de interes: $tasaInteres")
    }
}