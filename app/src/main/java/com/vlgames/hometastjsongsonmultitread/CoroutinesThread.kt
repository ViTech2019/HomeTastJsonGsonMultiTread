package com.vlgames.hometastjsongsonmultitread

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

object CoroutinesThread{

     val comand1 = GlobalScope.launch {
         println("${Thread.currentThread()} Displaying Thread Photos")
     }
    val comand2 = GlobalScope.launch {
        println("${Thread.currentThread()} Displaying Thread Posts")
    }
    val comand3 = GlobalScope.launch {
        println("${Thread.currentThread()} Displaying Thread Albums")
    }
}