package com.example.part3_kotlin

//WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

class exception: Throwable(){
    fun giveException(message: String){
        throw NoClassDefFoundError(message)
    }
}

fun main() {
    val e = exception()
    e.giveException("Exception is No Class Default Error")
}