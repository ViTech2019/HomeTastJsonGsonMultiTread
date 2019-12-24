package com.vlgames.hometastjsongsonmultitread

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.GsonBuilder
import com.vlgames.hometastjsongsonmultitread.CoroutinesThread.comand1
import com.vlgames.hometastjsongsonmultitread.CoroutinesThread.comand2
import com.vlgames.hometastjsongsonmultitread.CoroutinesThread.comand3
import com.vlgames.hometastjsongsonmultitread.dataClass.JsonClassAlbums
import com.vlgames.hometastjsongsonmultitread.dataClass.JsonClassPhotos
import com.vlgames.hometastjsongsonmultitread.dataClass.JsonClassPosts
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btnClick.setOnClickListener {
            Toast.makeText(this, "why!?!?!?!?!",Toast.LENGTH_LONG).show()
            comand1.start()
            jsonRequest1(tv1)
            comand2.start()
            jsonRequest2(tv2)
            comand3.start()
            jsonRequest3(tv3)
        }
    }


     private fun jsonRequest1(text: TextView) {
         val url = "https://jsonplaceholder.typicode.com/posts/1"
         val request = Request.Builder().url(url).build()
        val httpClient = OkHttpClient()
        val txtJson2 = text.findViewById<TextView>(R.id.tv1)

        httpClient.newCall(request).enqueue(object : Callback {

            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string()
                val gson = GsonBuilder().create()
                val jsonData: JsonClassPosts = gson.fromJson(body, JsonClassPosts::class.java)

                runOnUiThread { txtJson2.text = jsonData.toString() }.toString()
            }

            override fun onFailure(call: Call, e: IOException) {
                println("Failed to execute")
            }


        })
    }


    private fun jsonRequest2(text: TextView) {
        val url = "https://jsonplaceholder.typicode.com/albums/1"
        val request = Request.Builder().url(url).build()
        val httpClient = OkHttpClient()
        val txtJson2 = text.findViewById<TextView>(R.id.tv2)

        httpClient.newCall(request).enqueue(object : Callback {

            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string()
                val gson = GsonBuilder().create()
                val jsonData: JsonClassAlbums = gson.fromJson(body, JsonClassAlbums::class.java)

                runOnUiThread { txtJson2.text = jsonData.toString() }.toString()
            }

            override fun onFailure(call: Call, e: IOException) {
                println("Failed to execute")
            }


        })
    }


    private fun jsonRequest3(text: TextView) {
        val url = "https://jsonplaceholder.typicode.com/photos/1"
        val request = Request.Builder().url(url).build()
        val httpClient = OkHttpClient()
        val txtJson2 = text.findViewById<TextView>(R.id.tv3)

        httpClient.newCall(request).enqueue(object : Callback {

            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string()
                val gson = GsonBuilder().create()
                val jsonData: JsonClassPhotos = gson.fromJson(body, JsonClassPhotos::class.java)

                runOnUiThread { txtJson2.text = jsonData.toString() }.toString()
            }

            override fun onFailure(call: Call, e: IOException) {
                println("Failed to execute")
            }


        })
    }
}









//    }
//
//    private fun jsonCall() {
//        WebRequest.getWebPosts().getPosts().enqueue(object : Callback<JsonClassPosts> {
//
//            override fun onResponse(
//                call: Call<JsonClassPosts>,
//                response: Response<JsonClassPosts>
//            ) {
//                val body =
//                val gson = GsonBuilder().create()
//                val jsonPosts: JsonClassPosts? = gson.fromJson(body, JsonClassPosts::class.java)
//                if (response.isSuccessful) {
//                    runOnUiThread { tv1.text = jsonPosts.toString() }.toString()
//                } else {
//                    Log.d("error", "error")
//                }
//            }
//
//            override fun onFailure(call: Call<JsonClassPosts>, t: Throwable) {
//                Log.d("test", "error1")
//            }
//        })
//    }
//}
//

//    private fun jsonCall() {
//        getWebPosts().getPosts().enqueue(object : retrofit2.Callback<JsonClassPosts> {
//            override fun onResponse(call: retrofit2.Call<JsonClassPosts>, response: retrofit2.Response<JsonClassPosts>
//            ) {
//                if (response.isSuccessful) {
//                    Log.d("asd", "asd")
//                } else {
//                    Log.d("error", "error")
//                }
//            }
//
//            override fun onFailure(call: retrofit2.Call<JsonClassPosts>, t: Throwable) {
//                Log.d("321", "123")
//            }
//        })
//    }


