package com.bilqismufida.bitaqwa.dasarkotlin2

fun main() {
    //Datanya tidak bisa diubah (ini immutable list)
    val list = listOf("Ajinamoto", "Royco", "Sasa", "Masako")
    for (perusahaanMicin in list){
        println(perusahaanMicin)
    }
}