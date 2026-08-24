class CuentaCorriente (
    numeroCuenta: Int,
    cliente : Cliente,
    saldoInicial : Double,
    //atributo especifico de la clase
    val limiteTransferencia : Double,
    //Heredar
)  : CuentaBancaria(numeroCuenta, cliente, saldoInicial) {

    //heredar el metodo de la clase padre
    //sobreeescribir un metodo en java = @override
    override fun mostrarTipoCuenta() {
        println("Cuenta de Corriente")
        println("Limite de transferencia: $limiteTransferencia")
    }
}