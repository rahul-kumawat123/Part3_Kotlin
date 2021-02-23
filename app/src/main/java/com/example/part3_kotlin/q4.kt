package com.example.part3_kotlin

//WAP to create extension function.

class newFun{
    var s= "Kotlin"
}

class q4 {
    fun extension(){

        val n = newFun()
        println(n.person(n.s))
        println("----------------------------------------------------------------------------------")
    }
}

private fun newFun.person(s: String):Int {
        return s.length - 1
}



