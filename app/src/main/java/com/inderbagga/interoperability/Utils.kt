@file:JvmName("DemoUtils")

package com.inderbagga.interoperability

import java.io.IOException
import kotlin.jvm.Throws

fun foo():String="foo"

@Throws(IOException::class)
fun fetchFile(){

   throw IOException()

}