package com.bilqismufida.bitaqwa.latihan1

fun main() {
    val nomor = 4
    val nomorHasil = when (nomor){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "What kind of number is that?"
    }
    println(nomorHasil)
}