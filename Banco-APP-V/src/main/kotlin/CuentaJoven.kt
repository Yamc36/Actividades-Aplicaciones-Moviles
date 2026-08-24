class CuentaJoven(
    numeroCuenta: Int,
    cliente: Cliente,
    saldoInicial: Double,
    val descuento: Double
) : CuentaBancaria(numeroCuenta, cliente, saldoInicial) {

    override fun mostrarTipoCuenta() {
        println("Cuenta Joven")
        println("Descuento: $descuento%")
    }
}
