package com.example.part3_kotlin

//WAP to create sealed Base class and 3 subclasses of Base class, write a function which will have
// base class object as an argument and it will return name of the subclass based argument type.

sealed class A{
    class A1{}
    class A2{}
    class A3{}
}

class q3 {
    fun getName(A: Any) =when(A){
        is A.A1 -> println("A1 sublcass is invoked")
        is A.A2 -> println("A2 subclass is invoked")
        is A.A3 -> println("A3 subclass is invoked")
        else -> println("Invalid Output")
    }
    fun name(){
        val n = A.A2()
        getName(n)
        println("----------------------------------------------------------------------------------")
    }
}