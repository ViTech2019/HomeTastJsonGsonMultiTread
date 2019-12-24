package com.vlgames.hometastjsongsonmultitread
//
//
//
//
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//object WebRequest {
//    private const val BASE_URLPosts = "https://jsonplaceholder.typicode.com/posts/"
//
//    private const val BASE_URLAlbums = "https://jsonplaceholder.typicode.com/albums/"
//
//    private const val BASE_URLPhotos = "https://jsonplaceholder.typicode.com/photos/"
//
//
//    fun getWebPosts(): FullData =
//        Retrofit.Builder()
//            .baseUrl(BASE_URLPosts)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(FullData::class.java)
//
//
//    fun getWebAlbums(): FullData =
//        Retrofit.Builder()
//            .baseUrl(BASE_URLAlbums)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(FullData::class.java)
//
//
//    fun getWebPhotos(): FullData =
//        Retrofit.Builder()
//            .baseUrl(BASE_URLPhotos)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(FullData::class.java)
//
//}
//
