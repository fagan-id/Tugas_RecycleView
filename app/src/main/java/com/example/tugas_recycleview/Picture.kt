package com.example.tugas_recycleview

import android.net.Uri

data class Picture(
    val nameImage : String= " "
){
    fun getDrawable(): Int {
        return when(nameImage){
            "1" -> R.drawable.baseline_exposure_plus_1_24
            "2" -> R.drawable.baseline_exposure_plus_2_24
            "3" -> R.drawable.baseline_looks_3_24
            "4" -> R.drawable.baseline_4k_24
            "5" -> R.drawable.baseline_5g_24
            "6" -> R.drawable.baseline_6mp_24
            else -> R.drawable.baseline_exposure_plus_1_24
        }
    }
}
