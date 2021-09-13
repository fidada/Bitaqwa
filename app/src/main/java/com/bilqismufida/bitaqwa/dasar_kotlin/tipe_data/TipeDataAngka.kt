package com.bilqismufida.bitaqwa.dasar_kotlin

fun main() {
    //TIPE   DATA  N U M B E R
    val i: Int = 10000 //32 digit
    val d: Double = 100.00 //64 digit
    val f: Float = 100.00f //32 digit
    val l: Long = 1000000000 //64 digit
    val s: Short = 10 //16 digit
    val b: Byte = 1 //8 digit

    println("nilai int adalah "+i);
    println("nilai double adalah "+d);
    println("nilai float adalah "+f);
    println("nilai long adalah "+l);
    println("nilai short adalah "+s);
    println("nilai byte adalah "+b);

    val harga: Int =  20000
    val nama: String = "boni"
    val kondisi: Boolean = false
    val barang: Char = 'B'

    println()
    println("Apakah $nama membeli $barang dengan harga $harga?")
    println(kondisi)
}