package com.jung.thread

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {
    Thread({
        for (i in 1..10) {
            println("Thread 1 :${i}")
            Thread.sleep(50)
        }
    }).start()
    thread {
        for (i in 1..10) {
            println("thread() ${i}")
            Thread.sleep(50)
        }
    }
    GlobalScope.launch {
        for (i in 1..10) {
            println("coroutines: $i")
            delay(50L)
        }
    }
}
