package com.example.miprimerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //VariablesyConstantes()
        //EjercicioVarVal()

        //tiposDeVariableExDe()
       // operadores()
       // principal()
        //mostrar(resRedondeo)
        //sentenciaIf()
        //senteciaWhen()
        bucle()

    }
    /**
     * Esto es un comentarios multilineas
     * se escribe asi
     */


    private fun VariablesyConstantes(){
        //variable
        var miPrimeraVariable = "Hola estudiantes de Programación IV"
        println(miPrimeraVariable)
        miPrimeraVariable = "Esta es el nuevo valor de la variable"


        var miSegundaVariable = miPrimeraVariable
        println(miSegundaVariable)

        //Constante
        val miPrimerConstante = "Esta es una constante y no puedo cambia su valor"
        println(miPrimerConstante)
        //miPrimerConstante = "Otro valor de la constante"

        var miEntero = 2
        var miDoble =2.2
        println(miEntero)
        println(miDoble)

    }

    private fun EjercicioVarVal(){
        println("Primera Ejercicio")
        val nombre:String = "Pedro"
        //nombre = "Padri"
        var apellido:String = "Lopes"
        apellido = "Lopez"

        var edad:Int = 21
        edad = 22

        var salario = 600
        salario = 660

        var nombreCompleto = nombre+" "+apellido
        println(nombreCompleto)
        apellido = "López"

        nombreCompleto = nombre +" "+apellido
        println(nombreCompleto)

        val añoNacimiento= 2000
        var añoActual = Calendar.getInstance().get(Calendar.YEAR)
        var edadActual = añoActual - añoNacimiento
        println("Edad ="+edadActual)

    }

    private fun tiposDeVariableExDe(){
        //tipo entero
        var enteroExplicito:Int =45
        var enteroDeducido = 45
        println(enteroDeducido.javaClass)

        var dobleExplicito:Double = 45.45
        var dobleDeducido = 35.35
        println(dobleDeducido.javaClass)

        var flotanteExplicito:Float = 45.45F
        var flotanteDeducido = 35.35F
        println(flotanteDeducido.javaClass)

        var largoExplicito:Long = 454545L
        var largoDeducido = 353535L
        println(largoDeducido.javaClass)

        var textoExplicito:String = "45"
        var textoDeducido = "35"
        println(textoDeducido.javaClass)


    }

    private fun operadores(){
        val num1 = 4
        val num2 = 6

        //Suma
         var suma:Int = num1 + num2
         println("Suma: "+suma)

        //Resta
        var resta:Int = num1 - num2
        println("Resta: "+resta)

        //multiplicación
        var multiplicar:Int = num1 * num2
        println("Multiplicar: "+multiplicar)

        //Division
        var dividir:Int = num1 / num2
        println("División: "+dividir)



        //boolean (bool)
        val boolean1: Boolean = true
        val boolean2 = false
        val boolean3 = true
        println(boolean1 == boolean2)
        println(boolean1 && boolean3)
    }

    fun principal(){
        println("Hola estudiantes los saludo desde la funcion principal")

        saluda("Alex","Garcia")

        var saludo = retornarSaludo("Keyri","Calderon")
        println(saludo)

    }

    fun saluda(nombre:String,apellido:String){
        println(nombre+" "+apellido)
    }

    fun retornarSaludo(nombre:String,apellido: String):String{
        return nombre+" "+apellido
    }

   // var resSuma = suma(5.6,3.67f)
    //var resRedondeo = redondeo(resSuma)

    fun suma(num1:Double,num2:Float):Double{
        var resultado = num1+num2
        println(resultado.javaClass)
        return resultado
    }

    fun redondeo(num:Double):Double{
        var redondeo = Math.ceil(num)
        return redondeo
    }

    fun mostrar(num:Double){
        println(String.format("$%.2f",num))
    }

    private fun sentenciaIf(){
        val miNum1 = 12
        val miNum2 = 8
        val miNum3 = 45
        val miNum4 = 50
        val miNum5 = 6

        if(miNum1 <= 10){
            println("$miNum1 es menor o igual que 10")
        }else{
            println("$miNum1 es mayor que 10")
        }
    }

    private fun senteciaWhen(){
        val pais = "Alemania"

        when(pais){
            "El Salvador" ->{
                println("El idioma de $pais es el español")
            }
            "Brasil" ->{
                println("El idioma de $pais es el portugues")
            }
            "Francia" ->{
                println("El idioma de $pais es el frances")
            }
            "EEUU" ->{
                println("El idioma de $pais es el ingles")
            }
            else ->{
                println("No se encontro el pais por ende no sabemos el idioma")
            }
        }

        val edad =10

        when(edad){
            0,1,2 ->{
                println("Eres un bebé")
            }
            in 3 ..10 ->{
                println("Eres un niño/a")
            }
            in 11 ..17 ->{
                println("Eres un adolecente")
            }
            in 18 ..30 ->{
                println("Eres un adulto joven")
            }
            in 31 ..69 ->{
                println("Eres un adulto")
            }
            in 70 ..99 ->{
                println("Eres un anciano")
            }
            else ->{
                println("Eres muy viejo")
            }
        }

    }

    private fun bucle(){
        val miArreglo = listOf("Hola","alumnos","programación IV")

        for(miString in miArreglo){
            println(miString)
        }

        for(x in 0..10){
            println(x)
        }

        for(x in 0 until 10){
            println(x)
        }

        for(x in 0..10 step 2){
            println(x)
        }

        for(x in 10 downTo 0 step 3){
            println(x)
        }

    }


}