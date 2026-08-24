fun main(){
    println("BIENVENIDO A BANCO APP")

    //CREAR CLIENTE
    val cliente = Cliente(
        nombre = "Yona",
        rut = "28479740"
    )

    //CREAR CUENTAS
    val cuentaAhorro = CuentaAhorro(
        numeroCuenta = 1001,
        cliente,
        saldoInicial = 30000.0,
        tasaInteres = 3.5
    )
    val cuentaCorriente = CuentaCorriente(
        numeroCuenta = 284769740,
        cliente,
        saldoInicial = 60000.0,
        limiteTransferencia = 120000.0,
    )
    val cuentaJoven = CuentaJoven(
        numeroCuenta = 3005,
        cliente,
        saldoInicial = 15000.0,
        descuento = 20.0
    )

    //Lista para aplicar polimorfismo
    val cuentas : List<CuentaBancaria> = listOf(
        cuentaAhorro,
        cuentaCorriente,
        cuentaJoven,
    )

    for(cuenta in cuentas){
        println("------------------")
        cuenta.mostrarTipoCuenta()
    }

    //Manejo de errores
    try{
        println("Ingresa el monto a retirar")
        val monto = readln().toDouble()
        cuentaAhorro.retirar(monto)
    }catch(error: NumberFormatException){
        println("Debes Ingresar un numero")
    }catch (error: SaldoInsuficienteException){
        println("Error: ${error.message}")
        println("El saldo es insuficiente")
    }finally{
        println("Operacion Finalizada")
    }

    println("Programa finalizado sin errores de ejecucion")
}
