package com.inderbagga.interoperability.jink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AnotherMainActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val javaObject=JavaModel();
        javaObject.value=9
        javaObject.value.let { println(it) }

        javaObject.addition(4,5)

        javaObject.`any`().let { println(it) }

        JavaModel.display().let { println(it) }

        val array = intArrayOf(1, 2, 3, 4, 5, 6)
        javaObject.compute(array).let { println(it) }

        javaObject.anotherFunction( "Geeks", *array)
    }

}