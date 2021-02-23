package com.example.part3_kotlin

//WAP to create singleton class.

object single{
    init{
        println("Singleton class is invoked")
    }
}

class q2 {
    fun singleton(){
        println("----------------------------------------------------------------------------------")
        val s = single
        println(s)
        println("----------------------------------------------------------------------------------")
    }
}