package com.example.part3_kotlin

//WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

fun main() {
    try {
        Class.forName("q1")
    } catch (e: ClassNotFoundException) {
        e.printStackTrace()
        println("Excaeption ${e.message}")
    }
}