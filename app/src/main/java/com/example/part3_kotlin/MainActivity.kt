package com.example.part3_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
        //q1NoDefError.kt - NoClassDefFoundError
        //q1.kt - ClassNotFoundException


        //WAP to create singleton class.
        val ques2 = q2()
        ques2.singleton()


        //WAP to create sealed Base class and 3 subclasses of Base class, write a function which will have
        // base class object as an argument and it will return name of the subclass based argument type.
        val ques3 = q3()
        ques3.name()


        //WAP to create extension function.
        val ques4 = q4()
        ques4.extension()
    }
}