package com.inderbagga.interoperability.kinj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inderbagga.interoperability.R

class MainActivity : AppCompatActivity() {

    companion object{

        @JvmStatic
        fun displayTag():String="displaying Tag!"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}