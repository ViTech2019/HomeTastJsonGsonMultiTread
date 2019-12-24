package com.vlgames.hometastjsongsonmultitread.dataClass

import com.google.gson.annotations.SerializedName


data class JsonClassAlbums(

    @SerializedName("userId")
    var userId: Int,
    @SerializedName("id")
    var id: Int,
    @SerializedName("title")
    var title: String
)