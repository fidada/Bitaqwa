package com.bilqismufida.bitaqwa.dasar_kotlin

fun main() {
    val a = 10
    val b = 5
    val c = 15
    val contoh = false
    var hasil : Boolean

    hasil = (a>b) && (a>c) //true && false
    println("(10>5) && (10>15) : "+ hasil)

    hasil = (a>b) || (a>c) //true || false
    println("(10>5) || (10>15) : "+ hasil)

    hasil = !contoh // !false
    println("!contoh : "+ hasil)
}