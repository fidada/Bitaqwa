package com.bilqismufida.bitaqwa.dasarkotlin2.Class

//Car Frame
// *Class adalah kerangka sebuah aplikasi dan masih polos*
class Car {
    // #Properties#
    // *Lalu ditambah dengan properti/bagian bagiannya*
    var totalWheels = 4
    var totalDoors = 4
    var brand = "Toyota"
    var launchYear = "2020"
    var color = "Red"

    // #Method#
    // *Dan method adalah cara kerjanya*
    fun moveForward(){
        println("Car Move Forward")
    }

    fun moveBackward(){
        println("Car Move Backward")
    }
}