@file:JvmName("DemoUtils")
@file: JvmMultifileClass

package com.inderbagga.interoperability.kinj

import java.io.IOException
import kotlin.jvm.Throws

fun foo():String="foo"

@Throws(IOException::class)
fun fetchFile(){

   throw IOException()

}