package com.bilqismufida.bitaqwa.dasar_kotlin

fun main() {
    var nomor = 3
    var nomorHasil = when(nomor){
        1 -> "Satu"
        2 -> "Dua"
        3 -> "Tiga"
        4 -> "Empat"
        5 -> "Lima"
        else -> "Nomor Tydack Dikenal"
    }
    println(nomorHasil)
}