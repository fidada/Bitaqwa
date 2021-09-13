package com.bilqismufida.bitaqwa.latihan1

fun main() {
    var kukis = 13
    var pie = 9
    var cupcake = 15
    var hasil : Boolean

    println(kukis*pie)

    hasil = (kukis>pie) || (kukis>cupcake)
    println(hasil)

    kukis+=cupcake
    println("jumlah kukis ditambah dengan jumlah cupcake adlah "+kukis)

    println(--cupcake)

    val maksimal = if (kukis > pie){
        println("kukis lebih banyak dari pie")
        kukis
    }else{
        println("kukis lebih sedikit dari pie")
        pie
    }
    println("maksimal = $maksimal")
}