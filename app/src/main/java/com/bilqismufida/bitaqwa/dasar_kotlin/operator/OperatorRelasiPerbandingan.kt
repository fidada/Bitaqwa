package com.bilqismufida.bitaqwa.dasar_kotlin

fun main() {
    val a = 5
    val b = 10
    val maksimal = if (a > b){
        println("a lebih besar dari b")
        a
    }else{
        println("b lebih besar dari a")
        b
    }
    println("maksimal = $maksimal")
}