package com.bilqismufida.bitaqwa.dasarkotlin2.Class

//Constructor
//Propertinya ada di dalam kurung dan disebut dengan parameter
class Fruit(
    // #Parameter#
    var fruitColor : String,
    var fruitTaste : String,
    var fruitShape : String
) {
    // #Method#
    fun cut(){
        println("The fruit is cut")
    }

    fun peel(){
        println("The fruit is peeled")
    }
}