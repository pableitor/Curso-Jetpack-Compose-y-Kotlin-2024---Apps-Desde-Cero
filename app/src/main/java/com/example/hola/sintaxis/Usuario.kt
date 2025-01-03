package com.example.hola.sintaxis

class Usuario (
    var nombre: String,
    var edad: Int,
    var role: String,
    private var correo: String) {

    fun getCorreo(role: String) :String {
        if (role != "admin") {
            return("Acceso denegado")
        } else{
            return(correo)
        }
    }
    fun setCorreo(nuevoCorreo: String) {
        correo = nuevoCorreo
    }
}