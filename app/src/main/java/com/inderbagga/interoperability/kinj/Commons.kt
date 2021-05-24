package com.inderbagga.interoperability.kinj

import java.util.*

object Commons {

    @JvmStatic
    val version="1.0.1"
}

data class Event @JvmOverloads constructor(val name:String,@JvmField val date:Date=Date())