package com.example.hola.sintaxis

fun main(){

    mylambda(27,"Pablo",{mensaje -> println(mensaje)})
}

fun mylambda(edad:Int, nombre:String, felicitar:(String)  -> Unit){

    println("Entrando a la funcion lambda")
    felicitar(  "Feliz $edad cumpleaños $nombre !")
    println("Saliendo de la funcion lambda")

}