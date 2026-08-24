    //Clase Padre = open para que otras clases hijas puedan heredar

open class CuentaBancaria (
    val numeroCuenta: Int,
    //Los datos del cliente = al objeto Cliente
    val cliente: Cliente,
    saldoInicial: Double
) {
    //private = encapsulamiento = proteger datos
    private var saldo: Double  = saldoInicial


    //Permita consultar saldo
    fun obtenerSaldo(): Double {
        return saldo
    }

    //depositar saldo

    fun depositar (monto: Double){
        if (monto <= 0){
            throw IllegalArgumentException("El monto debe ser mayor a 0")
        }
        //si pasa por aca el monto es mayor a 0
        //saldo = saldo + monto
        saldo += monto
        println("Deposito realizado: $monto ; Nuevo saldo: $saldo")
    }

    //Retirar Dinero
    fun retirar(monto: Double){
        //saldo no puede ser menor que monto a retirar
        if (saldo < monto){
            throw SaldoInsuficienteException("Saldo Insuficiente")
        }

        //Saldo es mayor o igual al monto a retirar
        saldo -= monto
        println("Retiro Realizado por el monto de: $monto")
    }
    //Metodo que se puede heredar -> polimorfismo
    open fun mostrarTipoCuenta(){
        println("Cuenta Bancaria")
    }
}