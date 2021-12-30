package com.gb.material_1507_1544_3_1.view.recycler


const val TYPE_EARTH =0
const val TYPE_MARS =1
const val TYPE_HEADER =3
data class Data(val someText: String = "Text", val someDescription: String? = "Description",val type:Int=TYPE_MARS)
