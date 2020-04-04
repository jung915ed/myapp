package com.jung.thread

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
    var count = 1
    //mst for normal thread process
    var mst = measureTimeMillis {
        for (n in 1..100_000) {
            thread { count++ }
        }
    }
    println(mst)
    //msc for coroutines process
    var msc = measureTimeMillis {
        for (n in 1..100_000) {
            GlobalScope.launch { count++ }
        }
    }
    println(msc)
}