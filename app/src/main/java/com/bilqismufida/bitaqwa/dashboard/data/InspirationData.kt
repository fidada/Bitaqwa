package com.bilqismufida.bitaqwa.dashboard.data

import com.bilqismufida.bitaqwa.R
import com.bilqismufida.bitaqwa.dashboard.model.InspirationModel

object InspirationData {

    //Daftar Gambar dari Drawable
    private val inspirationImage = intArrayOf(
        R.drawable.img_inspiration,
        R.drawable.img_inspiration2,
        R.drawable.img_inspiration3,
        R.drawable.img_inspiration4,
        R.drawable.img_inspiration5
    )

    //Memproses data dari var diatas, yaitu inspiration image
    val listData : ArrayList<InspirationModel>
    get() {
        val list = arrayListOf<InspirationModel>()
        for (position in inspirationImage.indices){
            val inspiration = InspirationModel()
            inspiration.inspirationImageModel = inspirationImage[position]
            list.add(inspiration)
        }
        return list
    }
}