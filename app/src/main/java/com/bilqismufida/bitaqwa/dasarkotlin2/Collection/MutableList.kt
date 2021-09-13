package com.bilqismufida.bitaqwa.dasarkotlin2

fun main() {
    //Datanya bisa diubah
    val mutableList = mutableListOf("Pocari Sweat", "Coolant", "Mizone")
    mutableList.add("Isoplus")
    for (minumanION in mutableList){
        println(minumanION)
    }
}