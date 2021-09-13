package com.bilqismufida.bitaqwa.dashboard.model

//Berfungsi utk menyimpan data image

//kita mau pake data apa aja di recycler view? Image
//Biar recycler viewnya tau kalo data apa yg mau ditampilin
//Buat nampung data biar bisa diakses
//Data Class = class utk menampung data
data class InspirationModel (

    //pake tipe data integer, karena tipe data gambar itu int
    //isinya 0 utk mengatur nilai defaultnya
    var inspirationImageModel : Int = 0
)