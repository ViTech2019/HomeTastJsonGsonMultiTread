package com.vlgames.hometastjsongsonmultitread.dataClass

import com.google.gson.annotations.SerializedName

data class JsonClassPhotos (

    @SerializedName("userId")
    var userId: Int,
    @SerializedName("id")
    var id: Int,
    @SerializedName("title")
    var title: String,
    @SerializedName("body")
    var body: String,
    @SerializedName("url")
    var url: String,
    @SerializedName("thumbnailUrl")
    var thumbnailUrl: String
)



